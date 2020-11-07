/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magi
 */
public class CustomerAccount {

    public String AccType;

    public double Balance;

    public String getAccountType() {

        return AccType;

    }

    public double getBlance() {

        return Balance;
    }

    public void setBalance(double x) {

        Balance = x;
    }

    public CustomerAccount(String AccNumber, double Balance) {
        this.AccType = AccNumber;
        this.Balance = Balance;
    }
}
