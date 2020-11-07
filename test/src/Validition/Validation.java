
package Validition;

    
import java.util.Scanner;

public class Validation {

    static final Scanner sc = new Scanner(System.in);

    public static boolean checkYN() {
        while (true) {
            System.out.println("Would you like to contriniue?");
            String result = sc.nextLine();
            if (result.length() == 1) {
                char resultChar = result.charAt(0);
                if (resultChar == 'y' || resultChar == 'Y') {
                    return true;
                }
                if (resultChar == 'n' || resultChar == 'N') {
                    return false;
                }
            }
            System.err.println("Re-input");
        }
    }

    public static int checkint() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < 0) {
                    System.err.println(" is greater than equal zero");
                    System.out.print("Enter again:");
                    continue;
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println(" is digit");
                System.out.print("Enter again:");
            }
        }
    }

    public static double checkDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                if (result < 0) {
                    System.err.println(" is greater than equal zero");
                    System.out.print("Enter again:");
                    continue;
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println(" is digit");
                System.out.print("Enter again:");
            }
        }
    }

        public static String checkString() {
        while (true) {
           
            String result = sc.nextLine();
            
            if(result.trim()!=""){
             return result;
            }else
                System.err.println("Re-input");
                    
            }
           
        }      
}
