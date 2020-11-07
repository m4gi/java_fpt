/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

public class NodeBoat {

    public int height;
    private double arrivalTime;
    private String departPlace;
    private int booked;
    private int seat;
    String boatName;
    String bcode;
    Boat bu = new Boat(bcode, boatName, seat, booked, departPlace, arrivalTime);

    NodeBoat left;
    NodeBoat right;

    NodeBoat(Boat bu) {
        this.bu = bu;
        left = right = null;
    }
}
