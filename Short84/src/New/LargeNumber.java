/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

import java.util.ArrayList;

/**
 *
 * @author Le Tuan
 */
class MyBigInt {

    ArrayList<Integer> arr;

    public MyBigInt() {
    }

    public MyBigInt(String s) {
        int L = s.length();
        arr = new ArrayList<>();
        for (int i = 0; i < L; i++) {
            arr.add(0, s.charAt(i) - '0');
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = arr.size() - 1; i >= 0; i--) {
            s += (char) (arr.get(i) + '0');
        }
        return s;
    }

    void setzero(int n) {
        for (int i = 0; i < n; i++) {
            arr.add(0);
        }
    }

    MyBigInt add(MyBigInt b) {
        MyBigInt c = new MyBigInt();
        if (arr.size() < b.arr.size()) {
            setzero(b.arr.size() - arr.size());
        } else {
            b.setzero(arr.size() - b.arr.size());
        }
        int nho = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = arr.get(i) + b.arr.get(i) + nho;
            c.arr.add(sum % 10);
            nho = sum / 10;
        }
        if (nho == 1) {
            c.arr.add(nho);
        }
        return c;

    }

}

public class LargeNumber {

    public static void main(String[] args) {
        MyBigInt a = new MyBigInt("18446744073709551616");
        MyBigInt b = new MyBigInt("4294967296‬");

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.add(b));
    }
}
