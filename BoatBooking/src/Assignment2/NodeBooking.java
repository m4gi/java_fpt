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
public class NodeBooking extends Booking {
    NodeBooking next;
    int book;

    public NodeBooking(String bcode, String ccode, int seat) {
        super(bcode, ccode, seat);
    }


    public void setNext(NodeBooking next) {
        this.next = next;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
    
    
    
}
