/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short55;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Magi
 */
public class Validation {

    private final static Scanner in = new Scanner(System.in);

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input string
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    //check user input int
    public static int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkCodeExist(ArrayList<Doctor> ld, String code) {
        return ld.stream().noneMatch((doctor) -> (code.equalsIgnoreCase(doctor.getCode())));
    }

    public static boolean checkDuplicate(ArrayList<Doctor> ld, String code,
            String name, String specialization, int availability) {
        return ld.stream().noneMatch((doctor) -> (code.equalsIgnoreCase(doctor.getCode())
                && name.equalsIgnoreCase(doctor.getName())
                && specialization.equalsIgnoreCase(doctor.getSpecialization())
                && availability == doctor.getAvailability()));
    }

    public static boolean checkChangeInfo(Doctor doctor, String code,
            String name, String specialization, int availability) {
        return !(doctor.getCode().equalsIgnoreCase(code)
                && doctor.getName().equalsIgnoreCase(name)
                && doctor.getSpecialization().equalsIgnoreCase(specialization)
                && doctor.getAvailability() == availability);
    }

    static boolean doYouWantContinue() {
        return doYouWantContinue("Do you want to continue(Y/N): ", "Y", "N");
    }

    static boolean doYouWantContinue(String text, String var1, String var2) {
        System.out.print(text);
        while (true) {
            String rs = checkInputString();
            if (rs.equalsIgnoreCase(var1)) {
                return true;
            } else if (rs.equalsIgnoreCase(var2)) {
                return false;
            } else {
                System.out.printf("Please type %s/%s: ", var1, var2);
            }
        }
    }
}
