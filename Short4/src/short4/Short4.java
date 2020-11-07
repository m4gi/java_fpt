/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short4;

import java.util.Random;

/**
 *
 * @author Le Tuan
 */
public class Short4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Array a = new Array(r);
        a.Display();
        a.qsort();
        a.Display();
    }

}
