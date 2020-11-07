

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
import java.util.Arrays;
import java.util.Scanner;

public class ProducerConsumerQueue {

    ArrayList<String> pizza = new ArrayList<>();
    public static final Scanner input = new Scanner(System.in);

    public ProducerConsumerQueue() {
    }

    public void InputList() {
        System.out.print("Enter the pizza's list (pre by comma):");
        String item = checkString();
        String[] a = item.split("[,]");
        pizza.addAll(Arrays.asList(a));
        Cosumer c = new Cosumer(pizza);
        Producer p = new Producer(pizza);
        c.start();
        p.start();
    }

    public static String checkString() {
        String result;
        while (true) {
            result = input.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Can be empty!!");
                System.out.print("Try again: ");
            } else {
                return result;
            }
        }
    }
}
