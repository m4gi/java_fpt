/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short55;

import java.util.ArrayList;

/**
 *
 * @author Magi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Doctor> list = new ArrayList<>();
        while (true) {
            switch (Manager.menu()) {
                case 1:
                    Manager.addNewDoctor(list);
                    break;
                case 2:
                    Manager.updateDoctor(list);
                    break;
                case 3:
                    Manager.deleteDoctor(list);
                    break;
                case 4:
                    Manager.searchDoctor(list);
                    break;
                case 5:
                    System.out.println("Exit The Program Successful! ");
                    System.exit(0);
            }
        }
    }

}
