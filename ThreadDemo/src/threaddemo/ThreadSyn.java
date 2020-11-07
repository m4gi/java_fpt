/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Magi
 */
public class ThreadSyn {

    public synchronized static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        t1.start();
    }
}
