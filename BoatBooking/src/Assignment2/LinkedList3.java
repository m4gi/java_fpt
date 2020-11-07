/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author admin
 */
public class LinkedList3 {

    NodeBooking head, tail;
    int size;
    int check3 = 0;

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }

    void addToTail(String bcode, String ccode, int book) {
        NodeBooking p = new NodeBooking(bcode, ccode, book);
        if (isEmpty()) {
            head = p;
            tail = head;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    void printList(LinkedList3 list) {
        NodeBooking currNode = list.head;

        System.out.printf("%4s %s %4s %2s %20s", "bcode", "|", "ccode", "|", "amount_seats_booked");
        System.out.println("\n----------------------------------------------------");
        while (currNode != null) {

            System.out.printf("%4s %2s %4s %2s %10d ", currNode.bcode, "|", currNode.ccode, "|", currNode.seat);
            System.out.println("");
            currNode = currNode.next;
        }

    }

    NodeBooking divideList(NodeBooking a, NodeBooking b) {
        NodeBooking r = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        Booking book = new Booking();

        if (book.compareTo(a) == -1) {
            r = a;
            r.next = divideList(a.next, b);
        } else {
            r = b;
            r.next = divideList(a, b.next);
        }

        return r;
    }

    NodeBooking mergeSort(NodeBooking head) {
        // Base case : if head is null 
        if (head == null || head.next == null) {
            return head;
        }

        // get the middle of the list 
        NodeBooking mid = getMiddle(head);
        NodeBooking nextMid = mid.next;

        // set the next of middle node to null 
        mid.next = null;

        // Apply mergeSort on left list 
        NodeBooking left = mergeSort(head);

        // Apply mergeSort on right list 
        NodeBooking right = mergeSort(nextMid);

        // Merge the left and right lists 
        NodeBooking sortedList = divideList(left, right);
        return sortedList;
    }

    NodeBooking getMiddle(NodeBooking head) {
        NodeBooking mid = null;
        NodeBooking after = null;
        mid = after = head;
        while (after.next != null && after.next.next != null) {
            mid = mid.next;
            after = after.next.next;
        }
        return mid;
    }

    NodeBooking NodeSearch(String x_bcode, String x_ccode, LinkedList3 l) {

        check3 = 0;
        NodeBooking curr = l.head;

        while (curr != null) {
            if (x_ccode.equals(curr.ccode) && x_bcode.equals(curr.bcode)) {
                check3++;
                break;
            } else {
                curr = curr.next;
            }
        }
        return curr;
    }

    boolean search() {
        return check3 > 0;
    }
}
