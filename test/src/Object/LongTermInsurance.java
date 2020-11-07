
package Object;
import Validition.Validation;

public class LongTermInsurance extends insurrance{
    
    double feePerMounth;

    public double getFeePerMounth() {
        return feePerMounth;
    }

    public void setFeePerMounth(double feePerMounth) {
        this.feePerMounth = feePerMounth;
    }

    public LongTermInsurance() {
        
    }

    public LongTermInsurance(double feePerMounth, String CustomerName, int amounth, double fee) {
        super(CustomerName, amounth, fee);
        this.feePerMounth = feePerMounth;
    }

    @Override
    public double Commission() {
       return 0.5*feePerMounth;
    }
    
    public LongTermInsurance input(){
        LongTermInsurance longInsurance = new LongTermInsurance();
                System.out.println("Customer Name:");
        longInsurance.setCustomerName(Validation.checkString());
        System.out.println("Amounth:");
        longInsurance.setAmounth(Validation.checkint());
        System.out.println("Fee:");
        longInsurance.setFee(Validation.checkDouble());
        System.out.println("Fee per a mounth:");
        longInsurance.setFeePerMounth(Validation.checkDouble());
        return longInsurance;
    }
    
}
