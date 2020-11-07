package Model;

import Object.employees;
import Validition.Validation;
import java.util.ArrayList;
import java.util.Scanner;

public class process {

    static ArrayList<employees> company = new ArrayList<employees>();

    public static int choices() {

        System.out.println(
                "1. Add Employee\n"
                + "2. Display.\n"
                + "3. Display the employees have Commission greater 50$\n"
                + "4. Display the employees have been fine.\n"
                + "5.Display the employees have bonus greater 100$\n" + ""
                + "6. Exit.");
        int choice = Validation.checkint();
        return choice;
    }

    public static void option() {
        int choice = 0;
        do {
            choice = choices();
            switch (choice) {

                case 1: {
                    employees e = new employees();
                    e = e.input();
                    company.add(e);
                    break;
                }
                case 2: {
                    for (int i = 0; i < company.size(); i++) {
                        employees e = company.get(i);
                        System.out.println(e);

                    }
                    break;
                }
                case 3: {
                    for (int i = 0; i < company.size(); i++) {
                        employees e = company.get(i);
                        if (e.Commission() > 50) {
                            System.out.println(e);
                        }

                    }
                    break;
                }
                case 4: {
                    for (int i = 0; i < company.size(); i++) {
                        employees e = company.get(i);
                        if (e.saleMoney() < 10000) {
                            System.out.println(e);
                        }
                    }
                    break;
                }

                case 5: {
                    for (int i = 0; i < company.size(); i++) {
                        employees e = company.get(i);
                        if (e.Bonus() == 100) {
                            System.out.println(e);
                        }
                    }
                    break;
                }

                default:
                    System.out.println("choice from 1 to 5!");
            }
        } while (choices() != 6);
    }

    public static void main(String[] args) {
        option();

    }
}
