/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Magi
 */
public class Store {

    private String SID;
    private String SName;
    private String SAddress;
    private String SPhone;

    public Store() {
    }

    public Store(String SID, String SName, String SAddress, String SPhone) {
        this.SID = SID;
        this.SName = SName;
        this.SAddress = SAddress;
        this.SPhone = SPhone;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSAddress() {
        return SAddress;
    }

    public void setSAddress(String SAddress) {
        this.SAddress = SAddress;
    }

    public String getSPhone() {
        return SPhone;
    }

    public void setSPhone(String SPhone) {
        this.SPhone = SPhone;
    }

}
