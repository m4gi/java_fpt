/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boatbooking;

/**
 *
 * @author Le Tuan
 */
public class Manager {

    int MenuListBoat() {
        int choice;
        System.out.println("========Boat List========");
        System.out.println("1. Load data from file.");
        System.out.println("2. Input & add to head.");
        System.out.println("3. Display data.");
        System.out.println("4. Save boat list to file");
        System.out.println("5. Search by bcode.");
        System.out.println("6. Delete by bcode");
        System.out.println("7. Sort by bcode");
        System.out.println("8. Add the node before the node having bcode = xCode");
        System.out.println("9. Delete the node before the node having bcode = xCode");
        choice = Validation.checkInputIntLimit(1, 9);
        return choice;
    }

    int MenuCustomerList() {
        int choice;
        System.out.println("========Customer List========");
        System.out.println("1. Load data from file");
        System.out.println("2. Input & add to the end");
        System.out.println("3. Display data");
        System.out.println("4. Save customer list to file");
        System.out.println("5. Search by ccode");
        System.out.println("6. Delete by ccode");
        choice = Validation.checkInputIntLimit(1, 6);
        return choice;
    }

    int MenuBookingList() {
        System.out.println("========Booking List=======");
        System.out.println("1. Input data");
        System.out.println("2. Display Booking Data");
        System.out.println("3. Sort by bcode + ccode");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }

    int Menu() {
        System.out.println("==========Menu=========");
        System.out.println("1. Boat List");
        System.out.println("2. Customer List");
        System.out.println("3. Bookig List");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }

}
