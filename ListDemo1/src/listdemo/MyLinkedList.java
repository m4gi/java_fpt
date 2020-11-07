/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdemo;

/**
 *
 * @author ASUS
 */
public class MyLinkedList {

    Node head = null;
    Node tail = null;

    public MyLinkedList() {
    }

    public MyLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = p;
        }
    }

    public void addLast(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            tail = p;
            head = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    public void InsertPos(int value, int pos) {
        Node q = new Node(value);
        int pp = 1;
        Node p = head;
        while (p != null && pp < pos) {
            p = p.next;
            System.out.println("" + p.data);
        }
    }

    public void insertAfterPosition(int value, int position) {
        Node q = new Node(value);
        int pp = 1;
        // Chot p la vi tri ban dau de chay
        Node p = head;
        while (p != null && pp < position) {
            p = p.next;
            System.out.println("" + p.data);
            pp++;
        }
        // khi thoat khoi vong while, luc nay ta co
        // con tro dung o vi tri position, node dang o p
        // tiep tuc luu noi tiep theo
        Node tmp = p.next;
        p.next = q;
        q.next = tmp;

    }

    public void Display() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node p = new Node();
            p = head;
            System.out.println("" + p.data);
            while (p.next != null) {
                p = p.next;
                System.out.println("" + p.data);
            }

        }
    }
     public int deleteFirst() {
        // them vo rau ria may cai chekc Empty, Full
        Node p = head;
        head = head.next;
        // khuc ni return p.data de biet node nao bi xoa
        return p.data;
    }

    public int deleteLast() {
        // coi nhugn truong hop dac biet neu list=null
        Node p = head;
        Node befNodep = new Node();
        while (p.next != null) {
            befNodep = p;
            p = p.next;
        }
        tail = befNodep;
        befNodep.next = null;
        return p.data;
    }

}
