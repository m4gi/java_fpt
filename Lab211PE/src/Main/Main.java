/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Company.*;
import Object.*;
import Validation.*;
import java.util.ArrayList;

/**
 *
 * @author Magi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Employee> ComList = new ArrayList<>();

    public static void main(String[] args) {
        Employee em = new Employee();
        do {
            switch (Manager.Menu()) {
                case 1:
                    em = em.input();
                    ComList.add(em);
                    break;
                case 2:
                    for (int i = 0; i < ComList.size(); i++) {
                        em = ComList.get(i);
                        System.out.println(em);
                    }
                    break;
                case 3:
                    for (int i = 0; i < ComList.size(); i++) {
                        em = ComList.get(i);
                        if (em.Commission() > 50) {
                            System.out.println(em);
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < ComList.size(); i++) {
                        em = ComList.get(i);
                        if (em.saleMoney() < 10000) {
                            System.out.println(em);
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < ComList.size(); i++) {
                        em = ComList.get(i);
                        if (em.Bonus() == 100) {
                            System.out.println(em);
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
