/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Magi
 */
public class ThreadMain {

    public static void main(String[] args) {
        ThreadN N = new ThreadN();
        ThreadM obj = new ThreadM();
        Thread M = new Thread(obj);
        N.start();
        M.start();
    }

}
