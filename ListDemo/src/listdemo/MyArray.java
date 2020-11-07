package listdemo;

import static listdemo.ListDemo.sc;

public class MyArray {

    int arr[];
    int n;

    public MyArray() {
    }

    public MyArray(int size) {
        arr = new int[size];
        n = size;
    }

    public void Display() {
        System.out.println("\n=====================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
    }

    public void input() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter elements " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }
}
