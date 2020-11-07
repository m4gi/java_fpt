/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short1;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Short1 {

    public static void main(String[] args) {
        Random r = new Random();
        Array a = new Array(r);
        a.Display();
        a.bubbleSort();
        a.Display();
    }

}
