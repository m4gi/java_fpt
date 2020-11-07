/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphMatrix;

import java.util.Random;

/**
 *
 * @author Magi
 */
public class Graph {

    int vertex;
    int[][] edges;

    public Graph() {
    }

    public Graph(int vertex) {
        this.vertex = vertex;
        this.edges = new int[vertex][vertex];
    }

    public void display() {
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(" " + edges[i][j]);
            }
            System.out.println("");
        }
    }

    public void create() {
        Random r = new Random();
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                edges[i][j] = r.nextInt(2);
            }
        }
    }

    public void addEdge(int source, int destination) {
        edges[source][destination] = 1;
        edges[destination][source] = 1;
    }

    public void print() {
        System.out.println("Graph: (Adjacency Matrix):");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(edges[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < vertex; j++) {
                if (edges[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}
