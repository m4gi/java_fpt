package Object;

import java.util.ArrayList;
import Validition.Validation;

public class employees {

    String name;
    double coefficientsSalary;
    ArrayList<insurrance> listInsurance = new ArrayList<>();

    public employees() {
    }

    public employees(String name, double coefficientsSalary) {
        this.name = name;
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double Bonus() {
        double money = 0;
        int count = 0;

        for (insurrance ob : listInsurance) {
            if (ob.getFee() > 10000) {

                money += 100;
                break;
            }
        }
        return money;
    }

    public double Commission() {
        double money = 0;
        for (insurrance ob : listInsurance) {
            
            money += ob.Commission();

        }
        return money;
    }

    public double saleMoney() {
        double money = 0;
        for (insurrance ob : listInsurance) {
            money += ob.getFee();
        }

        return money;
    }
    
    public double fine(){
        if(saleMoney()<10000){
              return -30;
        }
            return 0;          
    }

    public double Salary() {
        return Bonus()+fine() + 40 * coefficientsSalary + 0.1 * saleMoney() + Commission();
    }

    @Override
    public String toString() {
        return "employees{" + "name=" + name + "Salary=" + Salary() + ","
                + " coefficientsSalary=" + coefficientsSalary + ","
                + "\n listInsurance=" + listInsurance + '}';
    }

    public employees input() {
        employees e = new employees();

        System.out.println("employee Name:");
        e.setName(Validation.checkString());
        System.out.println("coefficients Salary:");
        e.setCoefficientsSalary(Validation.checkDouble());
        e.choiceInsurance();

        return e;
    }

    public void choiceInsurance() {
        int choice = 0;
        do {
            System.out.println("1.short term inurance");
            System.out.println("2.long term inurance");
            System.out.println("0.Exit");
            choice = Validation.checkint();
            switch (choice) {
                case 1: {
                    ShortTermInsurance shortInsurance = new ShortTermInsurance();
                    shortInsurance = shortInsurance.input();
                    listInsurance.add(shortInsurance);
                    break;
                }
                case 2: {
                    LongTermInsurance longInsurance = new LongTermInsurance();
                    longInsurance = longInsurance.input();
                    listInsurance.add(longInsurance);
                    break;
                }
                default:
                    System.err.println("choice from 0 to 2!");
            }
        } while (choice != 0);
    }

}
