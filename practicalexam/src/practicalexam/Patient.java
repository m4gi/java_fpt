/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalexam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Patient implements iPatient {

    Scanner sc = new Scanner(System.in);
    String code;
    String fullname;
    private Date hospitalizedDate;
    String gender;
    private double medicineCost;

    public Patient() {
    }

    public Patient(String code, String fullname, Date hospitalizedDate, String gender, double medicineCost) {
        this.code = code;
        this.fullname = fullname;
        this.hospitalizedDate = hospitalizedDate;
        this.gender = gender;
        this.medicineCost = medicineCost;
    }

    public String getCode() {
        return code;
    }

    public String getFullname() {
        return fullname;
    }

    public Date getHospitalizedDate() {
        return hospitalizedDate;
    }

    public String getGender() {
        return gender;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFullname(String fullname) {
        System.out.print("Enter Full Name: ");
        fullname = sc.next();
        this.fullname = fullname;
    }

    public void setHospitalizedDate(Date hospitalizedDate) {
        String s;
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyy");
        System.out.print("enter work start date:");
        s = sc.next();
        try {
            hospitalizedDate = df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.hospitalizedDate = hospitalizedDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMedicineCost(double medicineCost) {
        this.medicineCost = medicineCost;
    }

    @Override
    public double getHospitalFee() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Patient inputData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Date getDischargedDate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Patient input() {
        Patient inp = new Patient();
        inp.setCode(code);
        inp.setFullname(fullname);
        inp.setGender(gender);
        inp.setHospitalizedDate(hospitalizedDate);
        inp.setMedicineCost(medicineCost);
        return inp;

    }
}
