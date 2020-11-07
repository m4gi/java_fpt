/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitest;

/**
 *
 * @author ASUS
 */
public class Minitest {

    /**
     * @param args the command line arguments
     */
    static int FindMin(int[] a, int n) {
        if (n == 1) {
            return a[0];
        }
        return (a[n] < FindMin(a, n - 1)) ? a[n] : FindMin(a, n - 1);
    }

    static int FindSum(int[] a, int n) {
        if (n == 0) {
            return a[0];
        }
        return a[n] + FindSum(a, n - 1);
    }

    static int Palindrome(int[] a, int f, int l) {
        if (f >= l) {
            return 1;
        }
        if (a[f] == a[l]) {
            return Palindrome(a, f + 1, l - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {0, 5, 1, 4, 6, 7, 9, 32, 2};
        int[] p = {1, 2, 3, 0, 3, 2, 1};
        int b = FindMin(a, a.length - 1);
        int c = FindSum(a, a.length - 1);
        int d = Palindrome(a, 0, a.length - 1);
        int e = Palindrome(p, 0, p.length - 1);
        System.out.println("Min value: " + b);
        System.out.println("Sum of array: " + c);
        if (d == 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        if (e == 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

}
