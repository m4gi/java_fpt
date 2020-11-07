package Assignment2;

import java.util.Scanner;


public class Validation {
    private static final Scanner in = new Scanner(System.in);
    private static final String VALID_ID = "[BC][0-9][0-9]";

    int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

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

    public static double checkInputDouble() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                if(result>=0) return result;
                System.err.println("Can't be a negative number");
                System.out.print("Enter again: ");
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }

    public static int checkInputSeat() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if(result>0) return result;
                System.err.println("Can't be a negative number");
                System.out.print("Enter again: ");
            } catch (NumberFormatException e) {
                System.err.println("Must be input Integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public static int checkInputBooked() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if(result>=0) return result;
                System.err.println("Can't be a negative number");
                System.out.print("Enter again: ");
            } catch (NumberFormatException e) {
                System.err.println("Must be input Integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputID() {
        while (true) {
            String result = checkInputString();
                if (result.matches(VALID_ID)) {
                    return result;
                }
                System.err.println("Please input ID flow"
                        + " B01"
                        + " C01");
                System.out.print("Enter again: ");
        }
    }
}
