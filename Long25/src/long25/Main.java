/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package long25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Magi
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            Scanner sc = new Scanner(new File("src\\input.txt"));
            try (FileWriter fw = new FileWriter("src\\output.txt")) {
                while (sc.hasNextLine()) {
                    String s = sc.nextLine();
                    if (s.isEmpty()) {
                        continue;
                    }
                    s = s.replaceAll("\\s+", " ");
                    s = s.toLowerCase();
                    String output = s.substring(0, 1).toUpperCase() + s.substring(1);
                    fw.write(output + ". ");
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
