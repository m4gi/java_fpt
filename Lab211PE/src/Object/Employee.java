/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.util.ArrayList;
import Company.*;
import Validation.*;

/**
 *
 * @author Magi
 */
public class Employee extends Company {

    protected String EName;
    protected double ESalaryRate;
    ArrayList<Insurrance> listIn = new ArrayList<>();

    public Employee() {
    }

    public Employee(String EName, float ESalaryRate) {
        this.EName = EName;
        this.ESalaryRate = ESalaryRate;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public double getESalaryRate() {
        return ESalaryRate;
    }

    public void setESalaryRate(double ESalaryRate) {
        this.ESalaryRate = ESalaryRate;
    }

    public void setESalaryRate(float ESalaryRate) {
        this.ESalaryRate = ESalaryRate;
    }

    public double Bonus() {
        double Money = 0;
        int count = 0;
        for (Insurrance ins : listIn) {
            if (ins.getIMoney() > 10000) {
                Money += 100;
            }
        }
        return Money;
    }

    public double Commission() {
        double Money = 0;
        for (Insurrance ins : listIn) {
            Money += ins.Commission();
        }
        return Money;
    }

    public double saleMoney() {
        double Money = 0;
        for (Insurrance ins : listIn) {
            Money += ins.getIMoney();
        }
        return Money;
    }

    public double Fine() {
        if (saleMoney() < 10000) {
            return -30;
        }
        return 0;
    }

    public double ESalary() {
        return Bonus() + Fine() + 40 * ESalaryRate + 0.1 * saleMoney() + Commission();
    }

    @Override
    public String toString() {
        return "Employee{" + "EName=" + EName + ", ESalaryRate=" + ESalaryRate + ", listIn=" + listIn + '}';
    }

    public void choiceInsurance() {
        int choice = 0;
        do {
            System.out.println("1.short term inurance");
            System.out.println("2.long term inurance");
            System.out.println("0.Exit");
            choice = Validation.checkInputInt();
            switch (choice) {
                case 1: {
                    ShortInsurrance shortInsurance = new ShortInsurrance();
                    shortInsurance = shortInsurance.input();
                    listIn.add(shortInsurance);
                    break;
                }
                case 2: {
                    LongInsurrance longInsurance = new LongInsurrance();
                    longInsurance = longInsurance.input();
                    listIn.add(longInsurance);
                    break;
                }
                default:
                    System.err.println("choice from 0 to 2!");
            }
        } while (choice != 0);
    }

    public Employee input() {
        Employee em = new Employee();
        System.out.print("Employee Name: ");
        em.setEName(Validation.checkInputString());
        System.out.print("Employee Salary Rate: ");
        em.setESalaryRate(Validation.checkInputDouble());
        em.choiceInsurance();
        return em;
    }
}
