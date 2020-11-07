package pr1;

import java.io.Serializable;

public class LinkedList<T> implements Serializable {

    Node head = null, tail = null;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public LinkedList(Node haed, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("list is empty");
        } else {
            Node p = new Node();
            p = head;
            System.out.print(" " + p.data + " ");
            while (p.next != null) {
                p = p.next;
                System.out.print(" " + p.data + " ");
            }

        }
    }

    public void addFist(int data) {
        Node p = new Node(data);
        if (isEmpty()) {
            head = p;
            tail = p;
        } else {
            p.next = head;
            // System.out.println(p.next +" ");
            head = p;
            // System.out.println(head);
        }

    }

    public void addLast(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
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

    public void insertBefore(Node p, int value) {
        Node q = new Node(value);
        int count = 0;
        if (p == head) {
            addFist(value);
            return;
        }

        if (p == tail) {
            addLast(value);
            return;
        }

        Node pj = head;

        while (pj.next != null) {
            if (pj.data != p.data) {
                count++;
                pj = pj.next;

            } else {
                insertAtPosition(count, value);
                return;
            }
        }
        System.out.println("not found");

    }

    public void insertAtPosition(int index, int value) {
        Node q = new Node(value);
        int count = 0;
        Node p = head;
        if (index == 0) {
            addFist(value);
            return;
        }
        while (count != index - 1) {
            count++;
            p = p.next;
        }
        if (count == (index - 1)) {
            Node temp = p.next;
            p.next = q;
            q.next = temp;
            System.out.println("sucessfully");
        }

    }

    public int[] toArray() {
        int[] result = new int[getSize()];
        int i = 0;
        for (Node<T> x = head; x != null; x = x.next) {
            result[i++] = x.data;
        }
        return result;
    }
//    public void ToArray() {
//            int[] arr = new int[100];
//            
//        if (isEmpty()) {
//            System.out.println("list is empty");
//        } else {
//            Node p = new Node();
//            p = head;
//            System.out.println(" " + p.data + " ");//nodeA
//            int i=0;
//            while (p.next != null) {
//                arr[i]=p.data;
//                i++;
//                p = p.next;
//                
//            }
//            System.out.println("Array:");
//            for (int j = 0; j <= i; j++) {
//               System.out.println(arr[j]+"  ");
//                
//            }
//        }
//    }
}
