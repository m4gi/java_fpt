/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.Scanner;

/**
 *
 * @author Magi
 */
public class Validation {

    static final Scanner in = new Scanner(System.in);

    public static String checkInputString() {
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

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(Validation.checkInputString());
                if (result > 0) {
                    return result;
                } else {
                    System.err.println("Must be greater than 0");
                    System.out.print("Enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input a number");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean doYouWantContinue() {
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
