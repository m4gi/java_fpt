/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitest;

/**
 *
 * @author Le Tuan
 */
public class MiniTest2 {
    
    static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
    
    static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return n * Power(x, n - 1);
    }
    
    static int Fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * Fact(n - 1);
    }
    
    static int Fibo(int n) {
        if (n < 2) {
            return 1;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }
    
    public static void main(String[] args) {
        System.out.println("GCD(15,20) = " + GCD(15, 20));
        System.out.println("Power of 2^8 = " + Power(2, 8));
        System.out.println("Factorial of 5: " + Fact(5));
        System.out.println("Fibonaci of 10: " + Fibo(10));
    }
}
