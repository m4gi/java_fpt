/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short63;

import java.util.Scanner;

/**
 *
 * @author Le Tuan
 */
public class Validation {

    public static String checkInputString() {
        Scanner sc = new Scanner(System.in);
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Can not be empty!");
                System.out.print("Please enter again: ");
            } else {
                return result;
            }
        }
    }

    public static double checkInputSalary() {
        while (true) {
            try {
                double result = Double.parseDouble(Validation.checkInputString());
                if (result > 0) {
                    return result;
                } else {
                    System.err.println("Salary is greater than zero!");
                    System.out.print("Enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.println("You must input digidt!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(Validation.checkInputString());
                if (result > 0) {
                    return result;
                } else {
                    System.err.println("Must be greater than 0");
                    System.out.print("Enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please nput integer number!");
                System.out.print("Enter again: ");
            }
        }
    }

    public Person inputPersonInfo() {
        System.out.println("Input Information of Person");
        System.out.print("Please input name: ");
        String name = checkInputString();
        System.out.print("Please input address: ");
        String address = checkInputString();
        System.out.print("Please input salary: ");
        double salary = checkInputSalary();
        return new Person(name, address, salary);
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
