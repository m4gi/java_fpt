/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short1;

import java.util.Random;

/**
 *
 * @author 
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
}
