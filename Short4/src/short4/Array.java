/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short4;

import java.util.Random;

/**
 *
 * @author Le Tuan
 */
public class Array {

    int[] data;
    int n;

    public Array(Random r) {
        this.n = r.nextInt(50);
        this.data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = r.nextInt(50);
        }
    }

    void Display() {
        System.out.println("Array: " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "  ");
        }
        System.out.println("");
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    void qsort() {
        int a = 0;
        int b = data.length;
        sort(data, a, b);
    }
}
