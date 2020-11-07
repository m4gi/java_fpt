/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short52;

public class Menu {

    static int menu() {
        System.out.println("                  MENU                ");
        System.out.println("************************************");
        System.out.println("1. Enter the information for 11 countries in Southeast Asia.");
        System.out.println("2. Display already information.");
        System.out.println("3. Search the country according to the entered country's name.");
        System.out.println("4. Exits");
        System.out.println("************************************");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;
    }
}
