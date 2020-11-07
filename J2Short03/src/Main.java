
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Magi
 */
public class Main {

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String acctype1, acctype2;
        double accb1, accb2, trans;
        System.out.print("Enter account type: ");
        acctype1 = checkString();
        System.out.print("Enter account balance ($): ");
        accb1 = checkInputDouble();
        System.out.print("Enter account type: ");
        acctype2 = checkString();
        System.out.print("Enter account balance ($): ");
        accb2 = checkInputDouble();
        System.out.print("Total money to transfer: ");
        trans = checkInputDouble();
        CustomerAccount acc1 = new CustomerAccount(acctype1, accb1);
        CustomerAccount acc2 = new CustomerAccount(acctype2, accb2);
        TransferManager t = new TransferManager(acc1, acc2, trans);
        Thread t1 = new Thread(t);
        t1.start();

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

    public static double checkInputDouble() {
        double result;
        while (true) {
            try {
                result = Double.parseDouble(input.nextLine().trim());
                if (result > 0) {
                    return result;
                } else {
                    System.out.println("Area must be greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.println("Please enter again: ");
            }
        }
    }
}
