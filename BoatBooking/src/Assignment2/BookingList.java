/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Scanner;


public class BookingList {
    Scanner sc = new Scanner(System.in);
    Validation va = new Validation();
    
    void BL1(BSTBoat bstb, LinkedList2 l2, LinkedList3 l3){
        String s,s2;
        int m = 0;
        NodeBoat n;
        NodeCustomer n2;

        System.out.println("---- Input data ----");
        System.out.print("Enter boat code: ");
        s = Validation.checkInputID();
        System.out.print("Enter customer code: ");
        s2 = Validation.checkInputID();
        System.out.print("Enter number of seats to be booked: ");
        m = Validation.checkInputSeat();

        n = bstb.searchRec(bstb.root, s);
        n2 = l2.NodeSearch(s2, l2);

        if(!bstb.search(s)||!l2.search()){
            System.err.println("Data not accepted!!");
        }
        if(l3.search()) System.out.println("Data not accepted!");
        if(bstb.search(s) && l2.search()){
            if(n.bu.getBooked() == n.bu.getSeat())
                System.err.println("The Boat is exhausted!!");
            else if(n.bu.getBooked()<n.bu.getSeat()){
                if(m<=(n.bu.getSeat()-n.bu.getBooked())){
                    System.err.println("Data accepted!");
                    l3.addToTail(s, s2, m);
                }
            }

        }
    }
        
    void BL2(LinkedList3 l){
        System.out.println("---- Display Data ----");
        l.printList(l);
    } 
    
    void BL3(LinkedList3 l){
        System.out.println("---- Sort by bcode and ccode ----");
        l.mergeSort(l.head);
        System.err.println("Sort Completed!!");
    }
    
    
        
}
