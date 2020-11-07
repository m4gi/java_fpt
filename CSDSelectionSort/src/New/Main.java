/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

import java.util.Scanner;

/**
 *
 * @author Magi
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int Menu() {
        System.out.println("1. Add test employee");
        System.out.println("2. Display employee");
        System.out.println("3. Sort Ascending");
        System.out.println("4. Insertion Sort");
        System.out.println("5. Bubble Sort");
        System.out.println("6. Quick Sort");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int choice;
        EmManager sort = new EmManager();

        do {
            choice = Menu();
            switch (choice) {
                case 1:
                    sort.Enter();
                    break;
                case 2:
                    sort.display();
                    break;
                case 3:
                    sort.selectionSortA();
                    break;
                case 4:
                    sort.insertionSort();
                    break;
                case 5:
                    sort.bubbleSort();
                    break;
                case 6:
                    sort.quickSortRun();
                    break;
                case 7:
                    break;
            }
        } while (choice <= 7);
    }
}
