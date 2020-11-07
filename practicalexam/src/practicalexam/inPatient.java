/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalexam;

import java.util.Date;

public class inPatient extends Patient {

    private Date dischargedDate;
    private double dailyFee;

    public inPatient() {
    }

    public inPatient(Date dischargedDate, double dailyFee, String code, String fullname, Date hospitalizedDate, String gender, double medicineCost) {
        super(code, fullname, hospitalizedDate, gender, medicineCost);
        this.dischargedDate = dischargedDate;
        this.dailyFee = dailyFee;
    }

    public int numberOfDate() {
        long noDate = (dischargedDate.getTime() - super.getHospitalizedDate().getTime()) / 86400000;
        return Math.toIntExact(noDate);
    }

    @Override
    public double getHospitalFee() {
        return (super.getMedicineCost() + dailyFee) * numberOfDate();
    }

    @Override
    public inPatient inputData() {
        System.out.print("Please enter in-patient's fullname: ");
        String fullname = Validation.checkInputString();
        System.out.print("Please enter hospitalized date: ");
        Date date = Validation.checkInputDate();
        System.out.print("Please enter in-patient's gender(m/f/u): ");
        String gender = Validation.checkInputGender();
        System.out.print("Please enter medicine cost: ");
        double cost = Validation.checkInputDouble();
        System.out.print("Please enter daily fee: ");
        double daiFee = Validation.checkInputDouble();
        System.out.print("Please enter discharged date: ");
        Date disDate = Validation.checkInputDate();
        inPatient inPa = new inPatient(disDate, daiFee, "0000", fullname, date, gender, cost);
        return inPa;
    }

    @Override
    public void printData() {
        System.out.printf("%-4s %-30s %2td/%2tm/%4tY %-6s %-10.2f %-10.2f %2td/%2tm/%4tY %10.2f\n", super.getCode(), super.getFullname(),
                super.getHospitalizedDate(), super.getHospitalizedDate(), super.getHospitalizedDate(), super.getGender(),
                super.getMedicineCost(), dailyFee, dischargedDate, dischargedDate, dischargedDate, getHospitalFee());
    }

    @Override
    public Date getDischargedDate() {
        return dischargedDate;
    }

}
