/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

import java.util.Scanner;

/**
 *
 * @author Le Tuan
 */
public class ThreadA extends Thread {

    public ThreadA() {
    }
    static Scanner scanner = new Scanner(System.in);

    static String nextString() {
        return scanner.nextLine();
    }

    static boolean doYouWantContinue() {
        return doYouWantContinue("Do you want to continue(Y/N): ", "Y", "N");
    }

    static boolean doYouWantContinue(String text, String var1, String var2) {
        System.out.print(text);
        while (true) {
            String rs = nextString();
            if (rs.equalsIgnoreCase(var1)) {
                return true;
            } else if (rs.equalsIgnoreCase(var2)) {
                return false;
            } else {
                System.out.printf("Please type %s/%s: ", var1, var2);
            }
        }
    }

    @Override
    public void run() {
        do {
            for (int i = 100; i >= 0; i--) {
                System.out.println("A " + i);
            }
        } while (doYouWantContinue());

    }
}
