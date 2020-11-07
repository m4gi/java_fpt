/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short68;

import java.util.ArrayList;
import java.util.Collections;
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
                System.err.println("Please input integer number!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.err.println("Please input Y/y or N/n.");
                System.out.print("Please enter again: ");
            }

        }
    }
}
