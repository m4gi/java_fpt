
package queuedemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
//        Queue<String> que = new LinkedList<>(); 
//        que.add("Le");
//        que.add("Anh");
//        que.add("Tuan");
//        System.out.println(""+que.poll());
//        System.out.println(""+que.poll());
//        System.out.println(""+que.poll());
        MyQueue que = new MyQueue(5);
        que.enqueue("Le");
        que.enqueue("Anh");
        que.enqueue("Tuan");
        que.enqueue("SE1404");
        que.enqueue("DE140280");  
        que.display();
        que.dequeue();
    }
}
