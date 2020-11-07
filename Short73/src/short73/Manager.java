/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short73;

import java.util.ArrayList;

/**
 *
 * @author Le Tuan
 */
public class Manager {

    public static int maxid = 0;

    public static int Menu() {
        System.out.println("=======Handy Expense program======");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Quit");
        System.out.print("Your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;
    }

    public static void AddE(ArrayList<Expense> list) {
        maxid += 1;
        System.out.println("-------- Add an expense--------");
        System.out.print("Enter Date: ");
        String date = Validation.checkInputString();
        System.out.print("Enter Amount: ");
        double amount = Validation.checkInputDouble();
        System.out.print("Enter Content: ");
        String content = Validation.checkInputString();
        list.add(new Expense(maxid, date, amount, content));
    }

    public static void display(ArrayList<Expense> list) {
        if (list.isEmpty()) {
            System.err.println("List is empty!");
            return;
        }
        System.out.println("-------- Add an expense--------");
        System.out.println("ID\tDate\t\tAmount\tContent");
        list.forEach((expense) -> {
            System.out.println(expense);
        });
    }

    public static void DeleteE(ArrayList<Expense> list) {
        if (list.isEmpty()) {
            System.err.println("List is empty!");
            return;
        }
        System.out.println("Enter ID:");
        int id = Validation.checkInputInt();
        try {
            for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getId()) {

                    if (id == maxid) {
                        if (i == 0) {
                            maxid = 0;
                        } else {
                            maxid = list.get(i - 1).getId();
                        }
                    }

                    list.remove(i);
                    System.out.println("Sucessfully");
                    return;
                }

            }
            System.out.println("Not found ID");
        } catch (Exception e) {
            System.err.println("Some problem!!!");
        }
    }
}
