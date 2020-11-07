/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Long23;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Magi
 */
public class Validation {

    private static final Scanner in = new Scanner(System.in);

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

        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input integer.");
                System.out.print("Enter again: ");
            }
        }
    }

    public static double checkInputDouble() {

        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
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

    public static boolean checkIdExist(ArrayList<Fruit> listfruit, String id) {
        return listfruit.stream().noneMatch((fruit) -> (id.equalsIgnoreCase(fruit.getFruitId())));
    }

    public static boolean checkItemExist(ArrayList<Order> listorder, String id) {
        return listorder.stream().noneMatch((order) -> (order.getFruitId().equalsIgnoreCase(id)));
    }
}
