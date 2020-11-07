/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short6;

import java.util.Random;

/**
 *
 * @author Le Tuan
 */
public class Main {
    
    public static void main(String[] args) {
        Random r = new Random();
        Array a = new Array(r);
        a.Display();
        a.bubbleSort();
        a.Search(18);
    }
}
