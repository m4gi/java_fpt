/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalexam;

import java.util.Date;

public class outPatient extends Patient {
    private double examinationFee;
    private double testingFee;

    public outPatient() {
    }

    public outPatient(double examinationFee, double testingFee, String code, String fullname, Date hospitalizedDate, String gender, double medicineCost) {
        super(code, fullname, hospitalizedDate, gender, medicineCost);
        this.examinationFee = examinationFee;
        this.testingFee = testingFee;
    }

    @Override
    public double getHospitalFee() {
        return super.getMedicineCost()+testingFee+examinationFee;
    }

    @Override
    public outPatient inputData() {
        System.out.print("Please enter out-patient's fullname: ");
        String fullname = Validation.checkInputString();
        System.out.print("Please enter hospitalized date: ");
        Date date = Validation.checkInputDate();
        System.out.print("Please enter out-patient's gender(m/f/u): ");
        String gender = Validation.checkInputGender();
        System.out.print("Please enter medicine cost: ");
        double cost = Validation.checkInputDouble();
        System.out.print("Please enter examination fee: ");
        double examFee = Validation.checkInputDouble();
        System.out.print("Please enter testing fee: ");
        double testFee = Validation.checkInputDouble();
        outPatient outPa = new outPatient(examFee,testFee,"0000",fullname,date,gender,cost);
        return outPa;
    }

    @Override
    public void printData() {
        System.out.printf("%-4s %-30s %2td/%2tm/%4tY %-6s %-10.2f %-10.2f %-10.2f %10.2f\n",super.getCode(),super.getFullname(),
            super.getHospitalizedDate(),super.getHospitalizedDate(),super.getHospitalizedDate(),
            super.getGender(),super.getMedicineCost(),examinationFee,testingFee,getHospitalFee());
    }


}