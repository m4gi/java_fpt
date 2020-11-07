/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASS;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author admin
 */
public class BoatList extends Boat {

    CheckInput ci = new CheckInput();
    Scanner sc = new Scanner(System.in);

    private static BufferedReader openFile(String nameFile) throws IOException {
        try {
            return new BufferedReader(new FileReader(nameFile));
        } catch (FileNotFoundException e) {
            throw new IOException("File [" + nameFile + "] not found.", e);
        }
    }

    private static String readFile(BufferedReader reader) throws IOException {
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }

    private static void readObjects(String fileContents, LinkedList l) {

        String[] parts = fileContents.split("\\|");
        for (int i = 0, length = parts.length; i < length; i += 6) {

            String tc = parts[i];
            String tn = ((i + 1) < length ? parts[i + 1] : "");
            int s = ((i + 2) < length ? Integer.parseInt(parts[i + 2]) : -1);
            int b = ((i + 3) < length ? Integer.parseInt(parts[i + 3]) : -1);
            double dt = ((i + 4) < length ? Double.parseDouble(parts[i + 4]) : -1);
            String dp = ((i + 5) < length ? parts[i + 5] : "");
            l.addToEnd(l, tc, tn, s, b, dt, dp);
        }
    }

    void Boat1(LinkedList list) throws FileNotFoundException {
        System.out.println("---- Load data from file ----");
        while (true) {
            System.out.print("Enter the file name to load data : ");
            Scanner sc = new Scanner(System.in);
            String nameFile = sc.nextLine().trim();

            BufferedReader reader;
            try {
                reader = openFile(nameFile);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return;
            }

            String fileContents;
            try {
                fileContents = readFile(reader);
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                return;
            }
            readObjects(fileContents, list);
            break;
        }
        System.err.println("Data input completed!");
    }

    void Boat2(LinkedList list) {

        System.out.println("----Input & Add to the head ----");
        System.out.print("Enter boat code: ");
        bcode = sc.next();
        System.out.print("Enter boat name: ");
        boatName = sc.next();
        System.out.print("Enter seat: ");
        seat = ci.CheckInput1(seat);
        System.out.print("Enter booked seat: ");
        booked = ci.CheckInput1(booked);
        System.out.print("Enter depart place: ");
        departPlace = sc.next();
        System.out.print("Enter depart rate: ");
        rate = ci.CheckInput2(rate);
        list.addToHead(list, bcode, boatName, seat, booked, rate, departPlace);
    }

    void addtest(LinkedList list) {
        list.addToHead(list, "B03", "Sug", 12, 3, 11, "PA");
        list.addToHead(list, "B01", "Mil", 10, 5, 5.7, "PC");
        list.addToHead(list, "B02", "App", 5, 2, 4, "PB");
        list.addToHead(list, "B05", "Roo", 7, 6, 15, "PE");
        list.addToHead(list, "B07", "Bee", 11, 3, 12, "PF");
        list.addToHead(list, "B04", "Boo", 9, 5, 5, "PD");
    }

    void Boat3(LinkedList list) throws IOException {

        System.out.println("---- Display Data ----");
        list.printList(list);

    }

    void Boat4(File f, LinkedList list) throws IOException {
        System.out.println("---- Save boat list to file ----");
        FileBoat.saveDataToFile(list);
    }

    void Boat5(LinkedList list) {
        String c;
        System.out.println("---- Search by Bcode ----");
        System.out.println("Enter the Bcode you want to search: ");
        c = sc.next();
        list.NodeSearch(c, list);
        if (list.search()) {
            System.err.println("Found!");

        } else {
            System.err.println("Data not found!");
        }

    }

    @SuppressWarnings("null")
    void Boat6(LinkedList list) {

        NodeBoat curr = list.head;
        NodeBoat prev = null;

        System.out.println("---- Delete by Bcode ----");
        String c = sc.next();

        if (curr != null && (curr.bcode == null ? c == null : curr.bcode.equals(c))) {
            list.head = curr.next;
            System.err.println("Found and Deleted!!");
        } else {

            while (curr != null && (curr.bcode == null ? c == null : !curr.bcode.equals(c))) {
                prev = curr;
                curr = curr.next;
            }

            if (curr != null) {
                prev.next = curr.next;
                System.err.println("Found and Deleted!!");
            }

            if (curr == null) {
                System.err.println("Bcode not found!!");
            }
        }
    }

    void Boat7(LinkedList list) {
        list.head = list.mergeSort(list.head);
        System.err.println("Sort Completed!!");

    }

    void Boat8(LinkedList list) {
        int k = 0;
        System.out.println("---- Add after position k ----");
        System.out.println("Enter position: ");
        k = ci.CheckInput1(k);
        System.out.print("Enter boat code: ");
        bcode = sc.next();
        System.out.print("Enter boat name: ");
        boatName = sc.next();
        System.out.print("Enter seat: ");
        seat = ci.CheckInput1(seat);
        System.out.print("Enter booked seat: ");
        booked = ci.CheckInput1(booked);
        System.out.print("Enter depart place: ");
        departPlace = sc.next();
        System.out.print("Enter rate: ");
        rate = ci.CheckInput2(rate);
        list.addAfter(k, list.head, bcode, boatName, seat, booked, rate, departPlace);
        System.err.println("Add completed!");
    }

    void Boat9(LinkedList list) {

        NodeBoat curr = list.head;
        NodeBoat prev = null;
        System.out.println("---- Delete before Bcode ----");
        String c = sc.next();

        if (curr != null && (curr.bcode == null ? c == null : curr.bcode.equals(c))) {
            System.err.println(curr.bcode + "is the first tcode in list!");
        } else {
            while (curr != null) {
                prev = curr;
                curr = curr.next;
                if ((curr.bcode == null ? c == null : !curr.bcode.equals(c))) {
                    prev = curr;
                    curr = curr.next;
                    break;
                }
            }
            if (curr != null) {
                prev.next = curr.next;
                System.err.println("Found and Deleted!!");
            }

            if (curr == null) {
                System.err.println("Bcode not found!!");
            }

        }
    }
}
