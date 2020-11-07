/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalexam;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Start {

    Scanner sc = new Scanner(System.in);
    private ArrayList<Patient> patientList = new ArrayList<>();
    private inPatient inPa = new inPatient();
    private outPatient outPa = new outPatient();

    public void setOrigin() {
        Date d1 = new Date("2020/04/03");
        outPa = new outPatient(150000, 60000, "O001", "Le Anh Tuan", d1, "M", 310000);
        patientList.add(outPa);
        d1 = new Date("2020/04/03");
        outPa = new outPatient(220000, 100000, "O002", "Hoang Chi Nhan", d1, "M", 450000);
        patientList.add(outPa);
        d1 = new Date("2020/04/01");
        outPa = new outPatient(240000, 110000, "O004", "Nguyen Hong Quang", d1, "M", 290000);
        patientList.add(outPa);
        d1 = new Date("2020/04/01");
        Date d2 = new Date("2020/04/02");
        inPa = new inPatient(d2, 170000, "I003", "Nguyen Thi Thanh Ha", d1, "Female", 510000);
        patientList.add(inPa);
        d1 = new Date("2020/03/27");
        d2 = new Date("2020/03/29");
        inPa = new inPatient(d2, 220000, "I005", "Le Bong", d1, "Female", 500000);
        patientList.add(inPa);
        d1 = new Date("2019/11/01");
        d2 = new Date("2019/11/11");
        inPa = new inPatient(d2, 90000, "I006", "Tran Ngoc Anh", d1, "Female", 720000);
        patientList.add(inPa);
    }

    public int isExist(String code) {
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    public void addPatient() {
        int choice;
        do {
            System.out.println("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Please input in-patient's code to add: ");
                    String code = Validation.checkInputCode();
                    if (isExist(code) != -1) {
                        System.err.println("This patient existed in the system");
                    } else {
                        inPa = inPa.inputData();
                        inPa.setCode(code);
                        patientList.add(inPa);
                        System.err.println("Input in-patient successful");
                    }
                    break;
                case 2:
                    System.out.print("Please input out-patient's code to add: ");
                    String Code = Validation.checkInputCode();
                    if (isExist(Code) != -1) {
                        System.err.println("This patient existed in the system");
                    } else {
                        outPa = outPa.inputData();
                        outPa.setCode(Code);
                        patientList.add(outPa);
                        System.err.println("Input out-patient successful");
                    }
                    break;
                case 0: //Exiting
                    break;
                default:
                    System.err.println("Wrong value!");
            }
        } while (choice != 0);
    }

    public void getAverageInPatient() {
        double total = 0;
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getClass().getSimpleName().equals("inPatient")) {
                total += patientList.get(i).getHospitalFee();
            }
        }
        System.out.println("The hospital's fee average of all the inpatients: " + total);
    }

    public void listOutPatient() {
        System.out.printf("%-4s %-30s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code", "Fullname", "HospitDate", "Gender", "MediCost", "ExamFee", "TestFee", "Hospital Fee");
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getClass().getSimpleName().equals("outPatient")) {
                patientList.get(i).printData();
            }
        }
    }

    public void searchPatient() {
        System.out.print("Please enter patient's code to search: ");
        String code = Validation.checkInputCode();
        int check = isExist(code);
        if (check == -1) {
            System.err.println("Sorry! There is not any patient!");
        } else {
            if (patientList.get(check).getClass().getSimpleName().equals("inPatient")) {
                System.out.printf("%-4s %-30s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code", "Fullname", "HospitDate", "Gender", "MediCost", "DailyFee", "DisDate", "Hospital Fee");
                patientList.get(check).printData();
            } else {
                System.out.printf("%-4s %-30s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code", "Fullname", "HospitDate", "Gender", "MediCost", "ExamFee", "TestFee", "Hospital Fee");
                patientList.get(check).printData();
            }
        }
    }

    public void minimumFee() {
        double minimum = patientList.get(0).getHospitalFee();
        int index = 0;
        for (int i = 1; i < patientList.size(); i++) {
            if (patientList.get(i).getHospitalFee() < minimum) {
                minimum = patientList.get(i).getHospitalFee();
            }
        }
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getHospitalFee() == minimum) {
                index = i;
            }
        }
        System.out.println("Last occurence of the patient having minimum hospital's fee is: " + index);
        if (patientList.get(index).getClass().getSimpleName().equals("inPatient")) {
            System.out.printf("%-4s %-30s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code", "Fullname", "HospitDate", "Gender", "MediCost", "DailyFee", "DisDate", "Hospital Fee");
            patientList.get(index).printData();
        } else {
            System.out.printf("%-4s %-30s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code", "Fullname", "HospitDate", "Gender", "MediCost", "ExamFee", "TestFee", "Hospital Fee");
            patientList.get(index).printData();
        }
    }

    public void removeInPatient() {
        System.out.print("Please input specified date: ");
        Date date = Validation.checkInputDate();
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getClass().getSimpleName().equals("inPatient")) {
                if (patientList.get(i).getDischargedDate().getTime() > date.getTime()) {
                    patientList.remove(i);
                }
            }
        }
        System.out.println("List of in-patients after removing: ");
        System.out.printf("%-4s %-30s %-10s %-6s %-10s %-10s %-10s %-10s\n", "Code", "Fullname", "HospitDate", "Gender", "MediCost", "DailyFee", "DisDate", "Hospital Fee");
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getClass().getSimpleName().equals("inPatient")) {
                patientList.get(i).printData();
            }
        }
    }

}
