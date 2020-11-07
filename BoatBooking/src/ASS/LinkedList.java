/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASS;

class LinkedList {

    NodeBoat head;
    NodeBoat tail;
    int size;
    int check = 0;

    String tcode;
    String BoatName;
    int seat;
    int booked;
    double departTime;
    String departPlace;

    LinkedList() {
        head = tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }
    //For Train 

    LinkedList addToHead(LinkedList list, String t_code, String boat_Name, int _seat, int _booked, double depart_Time, String depart_Place) {
        NodeBoat p = new NodeBoat(t_code, boat_Name, _seat, _booked, depart_Time, depart_Place);
        p.next = null;
        size++;
        if (isEmpty()) {
            head = p;
            tail = head;
        } else {
            p.next = head;
            head = p;
        }
        return list;
    }

    void addToEnd(LinkedList list, String t_code, String boat_Name, int _seat, int _booked, double depart_Time, String depart_Place) {
        NodeBoat p = new NodeBoat(t_code, boat_Name, _seat, _booked, depart_Time, depart_Place);
        p.next = null;
        size++;
        if (isEmpty()) {
            head = p;
            tail = head;
        } else {
            tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = p;
        }
    }

    void addAfter(int index, NodeBoat head, String t_code, String boat_Name, int _seat, int _booked, double depart_Time, String depart_Place) {
        int counter;
        NodeBoat curr = head;
        for (counter = 1; counter < index; counter++) {
            curr = curr.next;
        }
        NodeBoat q = new NodeBoat(t_code, boat_Name, _seat, _booked, depart_Time, depart_Place);
        q.next = curr.next;
        curr.next = q;
    }

    void printList(LinkedList list) {

        NodeBoat currNode = list.head;

        System.out.printf("%4s %s %9s %s %4s %s %6s %s %11s %s %6s %s %14s", "Bcode", "|", " Boat Name", "|", " Seat", "|", " Booked", "|", " Depart Place", "|", " Rate", "|", " Available Seat");
        System.out.println("\n-------------------------------------------------------------------------------------");
        while (currNode != null) {

            System.out.printf("%4s %2s %6s %6s %4d %2s %4d %4s %7s %6s %5s %5s %7s", currNode.bcode, "|", currNode.boatName, "|", currNode.seat, "|", currNode.booked, "|", currNode.departPlace, "|", currNode.rate, "|", (currNode.seat - currNode.booked));
            System.out.println("");
            currNode = currNode.next;

        }
    }

    NodeBoat NodeSearch(String xcode, LinkedList l) {

        check = 0;
        NodeBoat curr = l.head;
        while (curr != null) {
            if (xcode == null ? curr.bcode == null : xcode.equals(curr.bcode)) {
                check++;
                System.out.printf("%4s %2s %6s %6s %4d %2s %4d %4s %7s %6s %5s %5s %7s\n", curr.bcode, "|", curr.boatName, "|", curr.seat, "|", curr.booked, "|", curr.departPlace, "|", curr.rate, "|", (curr.seat - curr.booked));
                break;
            } else {
                curr = curr.next;
            }
        }
        
        return curr;
    }

    boolean search() {
        return check > 0;
    }

    NodeBoat divideList(NodeBoat a, NodeBoat b) {
        NodeBoat r = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        if (a.bcode.compareTo(b.bcode) <= 0) {
            r = a;
            r.next = divideList(a.next, b);
        } else {
            r = b;
            r.next = divideList(a, b.next);
        }

        return r;
    }

    NodeBoat mergeSort(NodeBoat head) {
        // Base case : if head is null 
        if (head == null || head.next == null) {
            return head;
        }

        // get the middle of the list 
        NodeBoat mid = getMiddle(head);
        NodeBoat nextMid = mid.next;

        // set the next of middle node to null 
        mid.next = null;

        // Apply mergeSort on left list 
        NodeBoat left = mergeSort(head);

        // Apply mergeSort on right list 
        NodeBoat right = mergeSort(nextMid);

        // Merge the left and right lists 
        NodeBoat sortedList = divideList(left, right);
        return sortedList;
    }

    NodeBoat getMiddle(NodeBoat head) {
        NodeBoat mid = null;
        NodeBoat after = null;
        mid = after = head;
        while (after.next != null && after.next.next != null) {
            mid = mid.next;
            after = after.next.next;
        }
        return mid;
    }

}
