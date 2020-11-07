package boatbooking;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Le Tuan
 */
public class MyListBoat {

    Node head;
    Node tail;

    public MyListBoat() {
        this.head = null;
        this.tail = null;
    }

    public void addHead(Boat std) {
        Node p = new Node(std);
        p.next = head;
        p.previous = null;
        if (head != null) {
            head.previous = p;
        }
        head = p;
    }

    public void addToTail(Boat element) {
        Node n = new Node(element);
        Node end = head;
        n.next = null;
        if (head == null) {
            n.previous = null;
            head = n;
        }
        while (end.next != null) {
            end = end.next;
        }
        end.next = n;
        n.previous = end;
    }

    public void addLast(Boat x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }

    public void deleteFirst() {
        Node p = head;
        head = head.next;
    }

    public int getSize() {
        int count = 0;
        Node i = head;
        while (i != null) {
            count++;
            i = i.next;
        }
        return count;
    }

    public void display() {
        Node i = new Node();
        i = head;
        do {
            System.out.println(i.data);
            i = i.next;
        } while (i != null);
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public void loadFromFile(String fname) throws Exception {
        RandomAccessFile f = new RandomAccessFile(fname, "r");
        StringTokenizer t;
        String s, s1, s2, s3, s4, s5, s6;
        int k, l;
        double dd;
        clear();
        while (true) {
            s = f.readLine();
            if (s == null) {
                break;
            }
            if (s.trim().length() < 5) {
                continue;
            }
            t = new StringTokenizer(s, "|");
            s1 = t.nextToken();
            s2 = t.nextToken();
            s3 = t.nextToken();
            k = Integer.parseInt(s3.trim());
            s4 = t.nextToken();
            l = Integer.parseInt(s4.trim());
            s5 = t.nextToken();
            s6 = t.nextToken();
            dd = Double.parseDouble(s6.trim());
            Boat a = new Boat(s1, s2, k, l, s5, dd);
            addLast(a);
        }
        f.close();
    }

    public Boat enterData() {
        Scanner sc = new Scanner(System.in);
        Boat b = new Boat();
        System.out.print("Enter BCode: ");
        b.bcode = Validation.checkInputString();
        System.out.print("Enter boat name: ");
        b.boat_name = Validation.checkInputString();
        System.out.print("Enter seat: ");
        b.seat = Validation.checkInputInt();
        System.out.print("Enter booked condition booked <= seats: ");
        b.booked = Validation.checkInputInt();
        while (b.booked > b.seat) {
            System.out.print("Enter booked condition booked <= seats: ");
            b.booked = Validation.checkInputInt();
        }
        System.out.print("Enter depart place: ");
        b.depart_place = Validation.checkInputString();
        System.out.println("Enter rate: ");
        b.rate = Validation.checkInputDouble();
        b = new Boat(b.bcode, b.boat_name, b.seat, b.booked, b.depart_place, b.rate);
        System.out.println("Done!");
        return b;
    }

    public void saveToFile(String fname) throws Exception {
        File f = new File(fname);
        if (f.exists()) {
            f.delete();
        }
        RandomAccessFile g = new RandomAccessFile(fname, "rw");
        Node p = head;
        while (p != null) {
            g.writeBytes(p.data + "\r\n");
            p = p.next;
        }
        System.out.println("Write to file " + fname + " Succesfull!");
        g.close();
    }

    public Node search(String bcodex) {
        Node p = head;
        Boat b = new Boat();
        while (p != null) {
            b = (Boat) p.getInfo();
            System.out.println(p.getInfo());
            String st1 = b.bcode.trim();
            if (st1.equalsIgnoreCase(bcodex)) {
                return (p);

            }
            p = p.next;
        }
        return (p);
    }

    public void SearchBoat() {
        System.out.print("Enter bcode: ");
        String xcode = Validation.checkInputString();
        System.out.println(search(xcode).getInfo());
    }

    private void clear() {
        head = null;
    }

}
