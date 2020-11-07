/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklab;

/**
 *
 * @author Le Tuan
 */
public class stack {

    nut dau;

    stack() {
        dau = null;
    }

    boolean empty() {
        return dau == null;
    }

    void push(int x) {
        nut t = new nut(x);
        t.ke = dau;
        dau = t;
    }

    int peek() {
        return dau.dl;
    }

    int pop() {
        int x = dau.dl;
        dau = dau.ke;
        return x;
    }
}
