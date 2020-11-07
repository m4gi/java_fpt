/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PE;

/**
 *
 * @author Magi
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Process {

    static Scanner sc = new Scanner(System.in);
    static String path, target;

    public static void inputString() {
        System.out.println("Please enter a path: ");
        path = sc.next();
        System.out.println("Please enter a target path: ");
        target = sc.next();
    }

    public static String searchFile() {
        File f = new File(path);

        if (!f.isFile()) {
            return "FILE NOT EXIST\n" + path;
        }
        try {
            //read file
            Scanner sc = new Scanner(f);

            String store = "";

            //doc all file
            while (sc.hasNext()) {
                //read hết dòng
                store = store.concat(sc.nextLine());
                store = store.concat("\n");
            }
            String result = store.replaceAll("[-+.^:!#$%^&*()=<>?/;0123456789'{},]", "");
            sc.close();

            return result;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Process.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String splitString(String s) {
        String store[] = s.split(" ");
        String result = "";
        for (int i = 0; i < store.length; i++) {
            String string = store[i];
            if (string.trim().length() != 0) {

                string = string.toLowerCase();

                string = (string.substring(0, 1).toUpperCase() + string.substring(1));

                result = result.concat(string);
                result = result.concat(" ");
            }
        }
        System.out.println(result);
        return result;
    }

    public static void addFile(String word) {
        try {
            //true= append
            FileWriter fw = new FileWriter(target, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(word + "\n");
            System.out.println("Sucessfull...");
            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Process.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Process obj = new Process();
        inputString();
        String s = searchFile();
        splitString(s);
        addFile(s);

    }
}
