package short10;

import java.util.Random;
import java.util.Scanner;

public class Short10 {

    int LinearSearch(int[] arr, int nb) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == nb) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        Short10 obj = new Short10();
        System.out.print("Enter number of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(20);
        }
        System.out.println("The Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nEnter search value: ");
        int nb = sc.nextInt();
        int vt = obj.LinearSearch(a, nb);
        if (vt == -1) {
            System.out.println("Không có " + nb + " trong mảng");
        } else {
            System.out.println("\n" + nb + " xuất hiện ở vị trí " + vt);
        }
        sc.close();

    }

}
