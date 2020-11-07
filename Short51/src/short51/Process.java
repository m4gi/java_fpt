/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short51;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Process {

    static Scanner sc = new Scanner(System.in);

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }
 public static double checkInputBMI() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("BMI is digit");
                System.out.print("Enter again: ");
            }
        }
    }
    public static int Menu() {
        System.out.println("=========== Calculator Program ===========");
        System.out.println("1. Normal Calculator.");
        System.out.println("2. BMI Calculator.");
        System.out.println("3. Exit.");
        System.out.print("Please choice one option: ");
        int choice = checkInputIntLimit(1, 3);
        return choice;
    }

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
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

    public static String checkInputOperator() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.err.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter again: ");
        }
    }

    public static double inputNumber() {
        System.out.print("Enter number: ");
        double number = checkInputDouble();
        return number;
    }

    public static void NormalCal() {
        double memory;
        System.out.print("Enter number: ");
        memory = checkInputDouble();
        while (true) {
            System.out.print("Enter operator: ");
            String op = checkInputOperator();
            if (op.equalsIgnoreCase("+")) {
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (op.equalsIgnoreCase("-")) {
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (op.equalsIgnoreCase("*")) {
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (op.equalsIgnoreCase("/")) {
                memory /= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (op.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            }
            if (op.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }
        }
    }

    public static void BMICal() {
        System.out.print("Enter Weight(kg): ");
        double weight = checkInputBMI();
        System.out.print("Enter Height(cm): ");
        double height = checkInputBMI();
        double bmi = weight * 10000 / (height * height);
        System.out.printf("BMI number: %.2f\n", bmi);
        if (bmi < 19) {
            System.out.println("Under-standard.");
        } else if (bmi >= 19 && bmi < 25) {
            System.out.println("Standard.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight.");
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println("Fat-should lose weight");
        } else {
            System.out.println("Very fat - should lose weight immediately");
        }
    }

}
