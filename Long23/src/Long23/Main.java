/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Long23;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Magi
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Fruit> listfruit = new ArrayList<>();
        Hashtable<String, ArrayList<Order>> listorder = new Hashtable<>();
        listfruit.add(new Fruit("1", "Coconut", 2, 100, "Vietnam"));
        listfruit.add(new Fruit("2", "Orange", 3, 100, "US"));
        listfruit.add(new Fruit("3", "Apple", 4, 100, "ThaiLand"));
        listfruit.add(new Fruit("4", "Grape", 6, 100, "France"));
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createFruit(listfruit);
                    break;
                case 2:
                    Manager.viewOrder(listorder);
                    break;
                case 3:
                    Manager.Shopping(listfruit, listorder);
                    break;
                case 4:
                    return;
            }
        }              
    }
}
