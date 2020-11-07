/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Validation.*;

/**
 *
 * @author Magi
 */
public class ShortInsurrance extends Insurrance {

    public ShortInsurrance() {
    }

    public ShortInsurrance(String IName, int ITime, double IMoney) {
        super(IName, ITime, IMoney);
    }

    @Override
    public double Commission() {
        return 0.05 * IMoney;
    }

    public ShortInsurrance input() {
        ShortInsurrance InShort = new ShortInsurrance();
        System.out.println("Customer Name:");
        InShort.setIName(Validation.checkInputString());
        System.out.println("Amounth:");
        InShort.setITime(Validation.checkInputInt());
        System.out.println("Fee:");
        InShort.setIMoney(Validation.checkInputDouble());
        return InShort;
    }
}
