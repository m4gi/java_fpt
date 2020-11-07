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
public class NodeCustomer extends Customer {
    
    NodeCustomer next;

    public NodeCustomer(String ccode, String cusName, String phone) {
        super(ccode, cusName, phone);
    }


    public void setNext(NodeCustomer next) {
        this.next = next;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}
