/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magi
 */
// Java program to implement solution of producer 
// consumer problem. 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Threadexample {

    public static void main(String[] args) throws InterruptedException {
        // Object of a class that has both produce() 
        // and consume() methods 
        final PC pc = new PC();

        // Create producer thread 
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread 
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads 
        t1.start();
        t2.start();

        // t1 finishes before t2 
        t1.join();
        t2.join();
    }

    // This class has a list, producer (adds items to list 
    // and consumber (removes items). 
    public static class PC {

        // Create a list shared by producer and consumer 
        ArrayList<String> list = new ArrayList<>();

        // Function called by producer thread 
        public void produce() throws InterruptedException {
            String value = "Deluxe Pizza, Single Pizza, American Pizza, Double Pizaa";
            String[] a = value.split("[,]");
            list.addAll(Arrays.asList(a));

            while (true) {
                synchronized (this) {
                    // producer thread waits while list 
                    // is full 
                    while (list.isEmpty()) {
                        wait();
                    }

                    System.out.println("Pizza dileveried: " + list.get(list.size() - 1));
                    list.remove(list.size() - 1);
                    System.out.println("Waitting...");
                    // to insert the jobs in the list 
//                    list.add(value++);
                    // notifies the consumer thread that 
                    // now it can start consuming 
                    notify();

                    // makes the working of program easier 
                    // to understand 
                    Thread.sleep(1000);
                }
            }
        }

        // Function called by consumer thread 
        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    // consumer thread waits while list 
                    // is empty 
                    while (list.isEmpty()) {
                        wait();
                    }
                    list.remove(list.size() - 1);
                    // to retrive the ifrst job in the list 
//                    int val = list.remove(capacity);
//                    System.out.println("Consumer consumed-"
//                            + value);
                    // Wake up producer thread 
                    notify();

                    // and sleep 
                    Thread.sleep(1000);
                }
            }
        }
    }
}
