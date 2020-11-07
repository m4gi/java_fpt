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

public class Validation {

    public static Scanner input = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = input.nextLine();
            if (!result.isEmpty()) {
                return result;
            }
            System.err.println("String can't be empty");
            System.out.print("Enter again: ");
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(input.nextLine());
                if (result > 0) {
                    return result;
                }
                System.err.println("Can't be a negative number");
                System.out.print("Enter again: ");
            } catch (NumberFormatException e) {
                System.err.println("Please input integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(input.nextLine());
                if (result > 0) {
                    return result;
                }
                System.err.println("Can't be a negative number");
                System.out.print("Enter again: ");
            } catch (NumberFormatException e) {
                System.err.println("Please input a double");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputGender() {
        while (true) {
            String result = input.nextLine();
            if (result.equalsIgnoreCase("m")) {
                return "Male";
            }
            if (result.equalsIgnoreCase("f")) {
                return "Female";
            }
            if (result.equalsIgnoreCase("u")) {
                return "Unknown";
            }
            System.err.println("Please enter m/f/u");
            System.out.print("Enter again: ");
        }
    }

    public static boolean checkInputTF() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("T")) {
                return true;
            }
            if (result.equalsIgnoreCase("F")) {
                return false;
            }
            System.err.println("Please enter t/T or f/F");
            System.out.print("Enter again: ");
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = input.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    public static String checkInputCode() {
        while (true) {
            String result = checkInputString();
            if (result.length() == 4) {
                return result;
            }
            System.err.println("Tour's code must have 4 characters");
            System.out.print("Enter again: ");
        }
    }

    public static Date checkInputDate() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        while (true) {
            String result = checkInputString();
            try {
                date = formater.parse(result);
                return date;
            } catch (ParseException e) {
                System.err.println("Please input in format (dd/MM/yyyy)");
                System.out.print("Enter again: ");
            }
        }
    }

    public static Date checkInputDischargedDate(Date dischargedDate) {
        Date date = new Date();
        while (true) {
            date = checkInputDate();
            if ((date.getTime() - dischargedDate.getTime()) > 0) {
                return date;
            }
            System.err.println("Discharged date must later than hospitalized date");
            System.out.print("Enter again: ");
        }
    }

}
