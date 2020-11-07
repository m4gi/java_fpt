/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Test {

    static int func(int x, int y) {

        if (x > y) {
            return -1;
        } else if (x == y) {
            return 1;
        }

        return x * func(x + 1, y);

    }

//    static int func(int x) {
//
//        if (x < 5) {
//            return 3 * x;
//        }
//        return 2 * func(x - 5) + 7;
//
//    }
//    static void test_a(int n) {
//        System.out.println(n + " ");
//        if (n > 0) {
//            test_a(n - 2);
//        }
//    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(func(4, 7));
        test_a(4);
    }

    public static void test_a(int n) {
        if (n > 0) {
            test_a(n - 2);
        }
        System.out.println(n + " ");
    }
}

class recursion {

    int func(int n) {

        if (n == 5) {
            return 5;
        }

        return func(n + 1) + n;

    }

}

class Output {

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        xMethod(x, 5);
    }

    public static void xMethod(int[] x, int length) {
        System.out.print(" " + x[length - 1]);
        xMethod(x, length - 1);
    }
}


// Tuổi 18 là cái tuổi đẹp nhất của mỗi con người, và chính là hôm này là ngày bước sang tuổi 18 ấy của Cẩm Ly. Vẫn là kỉ niệm xưa :> và lại thêm 1 năm quen nhau mà vẫn chưa có cơ hội gặp, sau bao lần hứa hẹn mà vấn chưa có cơ hội thực hiện. Vẫn là hẹn tiếp tương lai không xa sẽ gặp nhau đông đủ. Và điều quan trọng nhất vẫn là Chúc mừng sinh nhật - Happy Birth Day-
