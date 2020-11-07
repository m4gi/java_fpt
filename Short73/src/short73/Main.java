/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short73;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Expense> list = new ArrayList<>();
        while (true) {
            switch (Manager.Menu()) {
                case 1:
                    Manager.AddE(list);
                    break;
                case 2:
                    Manager.display(list);
                    break;
                case 3:
                    Manager.DeleteE(list);
                    break;
            }
        }
    }

}
