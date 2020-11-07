/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2;

import java.util.*;

/**
 *
 * @author Magi
 */
public class Node {

    private int val;
    private boolean visited;
    private List<Node> adjecents;

    public Node(int val) {
        this.val = val;
        this.adjecents = new ArrayList<>();
    }

    public void add(Node n) {
        this.adjecents.add(n);
    }

    public List<Node> getAdjacenets() {
        return adjecents;
    }

    public int getVal() {
        return this.val;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void setVal(int v) {
        this.val = v;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
