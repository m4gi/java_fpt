/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short52;

import java.util.Scanner;

public class Validation {

    public static final Scanner input = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(input.nextLine().trim());
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

    public static String checkString() {
        String result;
        while (true) {
            result = input.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Can be empty!!");
                System.out.print("Try again: ");
            } else {
                return result;
            }
        }
    }

    public static float checkInputFloat() {
        float result;
        while (true) {
            try {
                result = Float.parseFloat(input.nextLine().trim());
                if (result > 0) {
                    return result;
                } else {
                    System.out.println("Area must be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Must be input float");
                System.out.println("Please enter again: ");
            }
        }
    }
}
