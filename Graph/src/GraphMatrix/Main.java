/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphMatrix;

/**
 *
 * @author Magi
 */
public class Main {

    public static void main(String[] args) {
        Graph gr = new Graph(5);
        gr.addEdge(0, 1);
        gr.addEdge(0, 4);
        gr.addEdge(1, 2);
        gr.addEdge(1, 3);
        gr.addEdge(1, 4);
        gr.addEdge(2, 3);
        gr.addEdge(3, 4);
        gr.print();
    }
}
