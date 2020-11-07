/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Le Tuan
 */
public class ThreadB implements Runnable {

    public ThreadB() {
    }

    @Override
    public void run() {
        for (int i = 100; i >= 0; i--) {
            System.out.println("B " + i);
        }
    }
}
