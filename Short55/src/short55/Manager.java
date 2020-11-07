/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short55;

import java.util.ArrayList;

/**
 *
 * @author Magi
 */
public class Manager {

    public static int menu() {
        System.out.println("========= Doctor Management ==========");
        System.out.println("\t1. Add doctor");
        System.out.println("\t2. Update doctor");
        System.out.println("\t3. Delete doctor");
        System.out.println("\t4. Search doctor");
        System.out.println("\t5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }

    public static void addNewDoctor(ArrayList<Doctor> ld) {
        do {
            System.out.print("Enter code: ");
            String code = Validation.checkInputString();
            if (!Validation.checkCodeExist(ld, code)) {
                System.err.println("Code exist.");
                return;
            }
            System.out.print("Enter name: ");
            String name = Validation.checkInputString();
            System.out.print("Enter specialization: ");
            String specialization = Validation.checkInputString();
            System.out.print("Enter availability: ");
            int availability = Validation.checkInputInt();
            if (!Validation.checkDuplicate(ld, code, name, specialization, availability)) {
                System.err.println("Duplicate.");
                return;
            }
            ld.add(new Doctor(code, name, specialization, availability));
            System.err.println("Add successful.");
        } while (Validation.doYouWantContinue());
    }

    public static void updateDoctor(ArrayList<Doctor> ld) {
        System.out.print("Enter code: ");
        String code = Validation.checkInputString();
        if (Validation.checkCodeExist(ld, code)) {
            System.err.println("Not found doctor");
            return;
        }
        System.out.print("Enter code: ");
        String codeUpdate = Validation.checkInputString();
        Doctor doctor = getDoctorByCode(ld, code);
        System.out.print("Enter name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter specialization: ");
        String specialization = Validation.checkInputString();
        System.out.print("Enter availability: ");
        int availability = Validation.checkInputInt();
        if (!Validation.checkChangeInfo(doctor, code, name, specialization, availability)) {
            System.err.println("No change");
            return;
        }
        doctor.setCode(codeUpdate);
        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setAvailability(availability);
        System.err.println("Update successful");
    }

    public static void deleteDoctor(ArrayList<Doctor> ld) {
        System.out.print("Enter code: ");
        String code = Validation.checkInputString();
        Doctor doctor = getDoctorByCode(ld, code);
        if (doctor == null) {
            System.err.println("Not found doctor.");
            return;
        } else {
            ld.remove(doctor);
        }
        System.err.println("Delete successful.");
    }

    public static void searchDoctor(ArrayList<Doctor> ld) {
        System.out.print("Enter name: ");
        String nameSearch = Validation.checkInputString();
        ArrayList<Doctor> listFoundByName = listFoundByName(ld, nameSearch);
        if (listFoundByName.isEmpty()) {
            System.err.println("List empty.");
        } else {
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            listFoundByName.forEach((doctor) -> {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            });
        }
    }

    public static Doctor getDoctorByCode(ArrayList<Doctor> ld, String code) {
        for (Doctor doctor : ld) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

    public static ArrayList<Doctor> listFoundByName(ArrayList<Doctor> ld, String name) {
        ArrayList<Doctor> listFoundByName = new ArrayList<>();
        ld.stream().filter((doctor) -> (doctor.getName().contains(name))).forEachOrdered((doctor) -> {
            listFoundByName.add(doctor);
        });
        return listFoundByName;
    }
}
