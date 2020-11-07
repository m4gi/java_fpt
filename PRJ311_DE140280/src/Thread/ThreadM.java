/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Magi
 */
public class ThreadM implements Runnable {

    public ThreadM() {
    }

    @Override
    public void run() {
        for (int i = 200; i >= 100; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
