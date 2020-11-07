
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Magi
 */
public class Producer extends Thread {

    boolean available = false;
    public ArrayList<String> producer;

    public Producer(ArrayList<String> producer) {
        this.producer = producer;
    }

    @Override
    public synchronized void run() {
        while (true) {
            if (producer.isEmpty()) {
                break;
            }
            System.out.println("Pizza dileveried: " + producer.get(producer.size() - 1));
            producer.remove(producer.size() - 1);
            System.out.println("Waitting...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
