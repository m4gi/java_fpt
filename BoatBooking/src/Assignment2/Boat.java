/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Boat {

    protected String bcode;
    protected String boatName;
    protected int seat;
    protected int booked;
    protected String departPlace;
    protected double rate;

    public Boat() {
    }

    public Boat(String bcode, String boatName, int seat, int booked, String departPlace, double arrivalTime) {
        this.bcode = bcode;
        this.boatName = boatName;
        this.seat = seat;
        this.booked = booked;
        this.departPlace = departPlace;
        this.rate = arrivalTime;
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getBooked() {
        return booked;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

    public String getDepartPlace() {
        return departPlace;
    }

    public void setDepartPlace(String departPlace) {
        this.departPlace = departPlace;
    }

    public double getArrivalTime() {
        return rate;
    }

    public void setArrivalTime(double arrivalTime) {
        this.rate = arrivalTime;
    }

    void display() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.printf("%4s %2s %6s %6s %4d %2s %4d %4s %7s %6s %7s %7s  ", bcode, "|", boatName, "|", seat, "|", booked, "|", departPlace, "|", rate, "|");
    }

}
