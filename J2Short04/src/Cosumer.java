/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magi
 */
import java.util.ArrayList;

public class Cosumer extends Thread {
    boolean available = false;
    ArrayList<String> cosumer;

    public Cosumer(ArrayList<String> cosumer) {
        this.cosumer = cosumer;
    }

    @Override
    public synchronized void run() {
        while (true) {
            if (cosumer.isEmpty()) {
                break;
            }
            
            System.out.println("New pizza ready: " + cosumer.get(cosumer.size() - 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}
