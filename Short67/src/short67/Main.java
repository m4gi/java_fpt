/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short67;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Analyze A = new Analyze();
        String ch;
        Scanner in = new Scanner(System.in);
        System.out.println("===== Analysis String program ====");
        System.out.print("Input String: ");
        ch = in.nextLine();
        A.getNumber(ch);
        A.getCharacter(ch);
    }
}
