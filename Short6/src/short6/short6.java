package short6;

import java.util.Random;
import java.util.Scanner;

public class short6 {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) /2;
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
    static Random rd = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short6 obj = new short6();
        System.out.print("Enter number of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(100);
        }
        bubbleSort(a);
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nEnter search value: ");
        int nb = sc.nextInt();
        int vt = obj.binarySearch(a, 0, n, nb);
        if (vt == -1) {
            System.out.println("Không có " + nb + " trong mảng");
        } else {
            System.out.println(nb + " xuất hiện ở vị trí " + vt);
        }
        sc.close();
    }
}
