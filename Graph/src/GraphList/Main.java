/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphList;

/**
 *
 * @author Magi
 */
public class Main {

    public static void main(String[] args) {
        int vertices = 5;
        GraphList.Graph graph = new GraphList.Graph(vertices);
        graph.addEgde(0, 1, 600);
        graph.addEgde(0, 2, 700);
        graph.addEgde(1, 3, 500);
        graph.addEgde(1, 2, 500);
        graph.addEgde(2, 3, 400);
        graph.addEgde(3, 4, 1000);
        graph.addEgde(4, 0, 100);
        graph.printGraph();
    }
}
