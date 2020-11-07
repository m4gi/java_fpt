/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASS;


public class NodeBoat extends Boat{
    NodeBoat next;

   
    NodeBoat(String t_code, String boat_Name, int _seat, int _booked,double depart_Time, String depart_Place){
        bcode = t_code;
        boatName = boat_Name;
        seat = _seat;
        booked = _booked;
        rate = depart_Time;
        departPlace = depart_Place;
        next = null;
    }

    public void setTcode(String tcode) {
        this.bcode = tcode;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

    public void setDepartTime(double departTime) {
        this.rate = departTime;
    }

    public void setDepartPlace(String departPlace) {
        this.departPlace = departPlace;
    }
    


    
/*
    public Node getNext() {
        return next;
    }

    public int getI() {
        return i;
    }
*/

    @Override
    public String toString() {
        String c = String.format("%4s %2s %6s %6s %4d %2s %4d %4s %7lf %6s %7s %7s %7s",bcode,"|", boatName,"|", seat,"|", booked,"|", rate,"|", departPlace,"|", (seat-booked));
        return c;
    }
   
    
    
}
