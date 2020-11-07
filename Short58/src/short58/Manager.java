/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short58;

/**
 *
 * @author Magi
 */
public class Manager {
     public static int menu() {
        System.out.println("************************************");
        System.out.println("1. Add new word.");
        System.out.println("2. Delete word.");
        System.out.println("3. Translate word.");
        System.out.println("4. Exit.");
        System.out.println("************************************");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;
    }
}

