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
public class Manager {

    static int menu() {
        System.out.println("---FRUIT SHOP SYSTEM---");
        System.out.println("1. Create Fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;
    }

    static void createFruit(ArrayList<Fruit> listfruit) {
        while (true) {
            System.out.print("Enter fruit id: ");
            String fruitId = Validation.checkInputString();
            if (!Validation.checkIdExist(listfruit, fruitId)) {
                System.err.println("Id exist");
                return;
            }
            System.out.print("Enter fruit name: ");
            String fruitName = Validation.checkInputString();
            System.out.print("Enter price: ");
            double price = Validation.checkInputDouble();
            System.out.print("Enter quantity: ");
            int quantity = Validation.checkInputInt();
            System.out.print("Enter origin: ");
            String origin = Validation.checkInputString();
            listfruit.add(new Fruit(fruitId, fruitName, price, quantity, origin));
            //check user want to continue or not
            if (!Validation.doYouWantContinue()) {
                return;
            }
        }
    }

    //allow user show view order
    static void viewOrder(Hashtable<String, ArrayList<Order>> listorder) {
        for (String name : listorder.keySet()) {
            System.out.println("Customer: " + name);
            ArrayList<Order> lo = listorder.get(name);
            displayListOrder(lo);
        }
    }

    static void Shopping(ArrayList<Fruit> listfruit, Hashtable<String, ArrayList<Order>> listorder) {

        if (listfruit.isEmpty()) {
            System.err.println("No have item.");
            return;
        }

        ArrayList<Order> lo = new ArrayList<>();
        while (true) {
            displayListFruit(listfruit);
            System.out.print("Enter item: ");
            int item = Validation.checkInputIntLimit(1, listfruit.size());
            Fruit fruit = getFruitByItem(listfruit, item);
            System.out.print("Enter quantity: ");
            int quantity = Validation.checkInputIntLimit(1, fruit.getQuantity());
            fruit.setQuantity(fruit.getQuantity() - quantity);

            if (!Validation.checkItemExist(lo, fruit.getFruitId())) {
                updateOrder(lo, fruit.getFruitId(), quantity);
            } else {
                lo.add(new Order(fruit.getFruitId(), fruit.getFruitName(),
                        quantity, fruit.getPrice()));
            }

            if (!Validation.doYouWantContinue()) {
                break;
            }
        }
        displayListOrder(lo);
        System.out.print("Enter name: ");
        String name = Validation.checkInputString();
        listorder.put(name, lo);
        System.err.println("Add successfull");
    }

    static void displayListFruit(ArrayList<Fruit> listfruit) {
        int countItem = 1;
        System.out.printf("%-10s%-20s%-20s%-15s\n", "Item", "Fruit name", "Origin", "Price");
        for (Fruit fruit : listfruit) {
            if (fruit.getQuantity() != 0) {
                System.out.printf("%-10d%-20s%-20s%-2.0f%-20s\n", countItem++,
                        fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice(),"$");
            }
        }
    }

    static Fruit getFruitByItem(ArrayList<Fruit> listfruit, int item) {
        int countItem = 1;
        for (Fruit fruit : listfruit) {
            if (fruit.getQuantity() != 0) {
                countItem++;
            }
            if (countItem - 1 == item) {
                return fruit;
            }
        }
        return null;
    }

    static void displayListOrder(ArrayList<Order> listorder) {
        double total = 0;
        System.out.printf("%15s%15s%15s%15s\n", "Product", "Quantity", "Price", "Amount");
        for (Order order : listorder) {
            System.out.printf("%15s%15d%15.0f$%15.0f$\n", order.getFruitName(),
                    order.getQuantity(), order.getPrice(),
                    order.getPrice() * order.getQuantity());
            total += order.getPrice() * order.getQuantity();
        }
        System.out.println("Total: " + total);
    }

    //if order exist then update order
    static void updateOrder(ArrayList<Order> listorder, String id, int quantity) {
        for (Order order : listorder) {
            if (order.getFruitId().equalsIgnoreCase(id)) {
                order.setQuantity(order.getQuantity() + quantity);
                return;
            }
        }
    }
}
