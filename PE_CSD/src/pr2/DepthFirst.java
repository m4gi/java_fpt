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
public class DepthFirst {

    public void stack(Node node) {
        Stack<Node> depth = new Stack<Node>();
        depth.add(node);
        node.setVisited(true);
        while (!depth.isEmpty()) {
            Node nodeRemove = depth.pop();
            System.out.print(nodeRemove.getVal() + " ");

            List<Node> adjs = nodeRemove.getAdjacenets();
            for (int i = 0; i < adjs.size(); i++) {
                Node currentNode = adjs.get(i);
                if (currentNode != null && !currentNode.isVisited()) {
                    depth.add(currentNode);
                    currentNode.setVisited(true);
                }
            }
        }
    }
   
}
