/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short53;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Le Tuan
 */
public class Array {

    int[] data;
    int n;
    static Scanner sc = new Scanner(System.in);

    public Array() {

    }

    public void Input() {
        Random r = new Random();
        System.out.print("Enter number of array: ");
        this.n = sc.nextInt();
        this.data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = r.nextInt(50);
        }
    }

    void DisplayAccess() {
        System.out.println("Array: " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "  ");
        }
        System.out.println("");
    }

    void DisplayDeaccess() {
        System.out.println("Array: " + n);
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(data[i] + "  ");
        }
        System.out.println("");
    }

    void bubbleSort() {
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (data[j] > data[j + 1]) {

                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input integer");
                System.out.print("Enter again: ");
            }
        }
    }

    int menu() {
        int choice;

        System.out.println("========= Bubble Sort program =========");
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Descending");
        System.out.println("4. Exit");
        System.out.print("Please choice one option: ");
        choice = checkInputInt();
        return choice;
    }
}
