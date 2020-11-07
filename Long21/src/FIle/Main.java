/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIle;

/**
 *
 * @author Le Tuan
 */
public class Main {

    static int Menu() {
        int choice;

        System.out.println("1. Create");
        System.out.println("2. Find/Sort");
        System.out.println("3. Update/Delete");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }

    public static void main(String[] args) {
        Manage M = new Manage();
        while (true) {
            switch (Menu()) {
                case 1:
                    M.InputData();
                    break;
                case 2:
                    
                case 3:
                    
                case 4:
                    M.Report();
            }
        }

    }
}
