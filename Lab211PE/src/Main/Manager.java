/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Magi
 */
public class Manager {

    static final Scanner sc = new Scanner(System.in);

    static int Menu() {
        int choice;
        System.out.println("===========Menu===========");
        System.out.println("1. Input List Employee And Insurrance ");
        System.out.println("2. Display Infomation Employee And Insurrance ");
        System.out.println("3. Display The list of employees with commission> 50USD");
        System.out.println("4. Display the list of employees who are fined.");
        System.out.println("5. Display list of employees who are awarded 100USD");
        System.out.println("6. Exit");
        System.out.print("Choice: ");
        choice = sc.nextInt();
        return choice;
    }
}
