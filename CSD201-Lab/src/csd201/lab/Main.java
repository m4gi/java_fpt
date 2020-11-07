/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd201.lab;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    private static int checkInput() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter agian: ");
            }
        }
    }

    private static int inputSizeOfArray() {
        System.out.print("Enter number of array: ");
        int n = checkInput();
        return n;
    }

    private static int[] inputArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = checkInput();
        }
        return a;
    }

    private static void SortArray(int[] a) {
        System.out.println("Unsorted Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    private static void Display(int[] a) {
        System.out.println("Sorted Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] argv) {
        int n = inputSizeOfArray();
        int[] a = inputArray(n);
        SortArray(a);

        Display(a);
    }
}
