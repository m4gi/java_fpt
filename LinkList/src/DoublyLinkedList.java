
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DoublyLinkedList<T> {

    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addHead(T std) {
        Node p = new Node(std);
        p.next = head;
        p.previous = null;
        if (head != null) {
            head.previous = p;
        }
        head = p;
    }

    public void addToTail(T element) {
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
            System.out.println(i.data.toString());
            i = i.next;
        } while (i != null);
    }

    public void writeFile() {
        Node i = new Node();
        i = head;
        while (i != null) {
            try (FileOutputStream fos = new FileOutputStream("object.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(i.data);
                i = i.next;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
