package DoubleLinkedList;

/**
 *
 * @author ASUS
 */
public class MyDoublyLinkedList {
    
    Node head = null;
    Node tail = null;

    public MyDoublyLinkedList() {
    }

    public MyDoublyLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void addF(Customer x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    public void addL(Customer x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    public void insert(Customer x, int n) {
        if (isEmpty() && n != 0) {
            System.out.println("Empty linkedlist");
        } else {
            Node p1 = new Node(x);
            int dem = 1;
            //p la vtri dau de chay
            Node p = head;
            while (p != null && dem < n) {
                p = p.next;
                dem++;
            }
            Node tam = p.next;
            p.next = p1;
            p1.next = tam;
        }
    }

    public void deleteF() {
        int dem = 0;
        if (isEmpty()) {
            System.out.println("Empty linkedlist");
        } else {
            Node p = head;
            head = head.next;
        }
    }

    public void deleteL() {
        if (isEmpty()) {
            System.out.println("Empty linkedlist");
        } else {
            Node p = head;
            while (p.next.next != null) {
                p = p.next;
            }
            tail = p;
            p.next = null;
        }
    }

    public void size() {
        if (isEmpty()) {
            System.out.println("Empty linkedlist");
        } else {
            int dem = 0;
            Node p = head;
            while (p != null) {
                p = p.next;
                dem++;
            }
            System.out.println("Size of array list: "+dem);
        }
    }

    public void search(Customer x) {
        Node p = head;
        int dem = 0;
        while (p != null && p.data != x) {
            p = p.next;
            dem++;
        }
        System.out.println("Position of customer: "+dem);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("This LinkedList is empty");
        } else {
            Node p = new Node();
            p = head;
            System.out.println(p.data);
            while (p.next != null) {
                p = p.next;
                System.out.println(" " + p.data);
            }
            System.out.println("\n");
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

}
