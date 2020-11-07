/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package long22;

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
        ArrayList<Candidate> list = new ArrayList<>();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createCandidate(list, 0);
                    break;
                case 2:
                    Manager.createCandidate(list, 1);
                    break;
                case 3:
                    Manager.createCandidate(list, 2);
                    break;
                case 4:
                    Manager.searchCandidate(list);
                    break;
                case 5:
                    return;
            }
        }
    }
}
