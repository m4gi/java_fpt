package boatbooking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Le Tuan
 */
public class Boat {

    String bcode, boat_name, depart_place;
    Integer seat, booked;
    double rate;

    public Boat() {
    }

    public Boat(String bcode, String boat_name, Integer seat, Integer booked, String depart_place, double rate) {
        this.bcode = bcode;
        this.boat_name = boat_name;
        this.depart_place = depart_place;
        this.seat = seat;
        this.booked = booked;
        this.rate = rate;
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getBoat_name() {
        return boat_name;
    }

    public void setBoat_name(String boat_name) {
        this.boat_name = boat_name;
    }

    public String getDepart_place() {
        return depart_place;
    }

    public void setDepart_place(String depart_place) {
        this.depart_place = depart_place;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Integer getBooked() {
        return booked;
    }

    public void setBooked(Integer booked) {
        this.booked = booked;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return bcode + "  |  " + boat_name + "  |  " + seat + "  |  " + booked + "  |  " + depart_place + "  |  " + rate;
    }

}
