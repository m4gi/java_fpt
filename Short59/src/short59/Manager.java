/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short59;

public class Manager {

    public static int menu() {
        System.out.println("========== File Processing =========");
        System.out.println("1. Find person info.");
        System.out.println("2. Copy Text to new file.");
        System.out.println("3. Exit.");
        System.out.println("************************************");
        System.out.println("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }

}
