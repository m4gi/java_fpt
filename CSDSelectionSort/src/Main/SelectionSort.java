/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Magi
 */
public class SelectionSort {

    void selectionSort(int arr[]) {
        int n = arr.length;
        int minIndex, min;

        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            min = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    minIndex = j;
                    min = arr[j];
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int arr[] = {15, 8, 10, 2, 5};
        obj.selectionSort(arr);
        System.out.println("...");
        obj.print(arr);
    }

}
