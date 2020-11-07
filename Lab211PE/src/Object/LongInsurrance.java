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
public class LongInsurrance extends Insurrance {

    double LMoney;
    double LMoneypM;

    public LongInsurrance() {
    }

    @Override
    public double Commission() {
        return 0.5 * LMoneypM;
    }

    public LongInsurrance input() {
        LongInsurrance longInsurance = new LongInsurrance();
        System.out.println("Amounth:");
        longInsurance.setIName(Validation.checkInputString());
        System.out.println("Fee:");
        longInsurance.setITime(Validation.checkInputInt());
        System.out.println("Fee per a mounth:");
        longInsurance.setIMoney(Validation.checkInputDouble());
        return longInsurance;
    }
}
