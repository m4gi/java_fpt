package short6;

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

    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    void Search(int x) {
        int a = binarySearch(data, 0, data.length - 1, x);
        if (a != -1) {
            System.out.println("Position of " + x + " : " + a);
        } else {
            System.out.println("Don't have " + x + " in array!");
        }
    }
}
