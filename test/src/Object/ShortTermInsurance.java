
package Object;

import Validition.Validation;

public class ShortTermInsurance extends insurrance{

    public ShortTermInsurance() {
    }

    public ShortTermInsurance(String CustomerName, int amounth, double fee) {
        super(CustomerName, amounth, fee);
    }
    
    

    @Override
    public double Commission() {
      return fee*0.05;
    }
    
    public ShortTermInsurance input(){
        ShortTermInsurance InShort = new ShortTermInsurance();
        System.out.println("Customer Name:");
        InShort.setCustomerName(Validation.checkString());
        System.out.println("Amounth:");
        InShort.setAmounth(Validation.checkint());
        System.out.println("Fee:");
        InShort.setFee(Validation.checkDouble());
        return InShort;
    }
            
}
