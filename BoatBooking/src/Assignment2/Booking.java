/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Comparator;

public class Booking implements Comparable<Booking> {

    protected String bcode;
    protected String ccode;
    protected int seat;

    public Booking(String bcode, String ccode, int seat) {
        this.bcode = bcode;
        this.ccode = ccode;
        this.seat = seat;
    }

    public Booking() {
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public int compareTo(Booking b) {
        return Comparator.comparing(Booking::getBcode).
                thenComparing(Booking::getCcode).
                compare(this, b);
    }
}
