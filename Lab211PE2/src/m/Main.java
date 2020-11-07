/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

/**
 *
 * @author tranp
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        NormalizeText mn = new NormalizeText();
        BufferedReader br = null;
        try {

            int count = 1;
            System.out.print("Enter file name:");
            String uFile = sc.nextLine();
            int countLine = mn.countLine(uFile);
            br = new BufferedReader(new FileReader(new File(uFile)));
            PrintWriter pw = null;
            String line;
            //write until end file
            while ((line = br.readLine()) != null) {
                //check line empty
                if (mn.isLineEmpty()) {
                    continue;
                }
                mn.setLine(line);
                line = mn.formatOneSpace();
                mn.setLine(line);
                line = mn.formatSpecialCharacters();
                mn.setLine(line);
                line = mn.afterDotUpperCase();
                mn.setLine(line);
                line = mn.noSpaceQuotes();
                mn.setLine(line);
                line = mn.firstUpercase();
                mn.setLine(line);
                line = mn.lastAddDot();
                System.out.print("Please enter a target path:");
                uFile = sc.nextLine();
                pw = new PrintWriter(new BufferedWriter(new FileWriter(uFile, true)));
                pw.print(line);
                if (count < countLine) {
                    pw.print(System.getProperty("line.separator"));
                }
                count++;
            }
            br.close();
            pw.close();
            System.out.println("Normalize successful.");
        } catch (FileNotFoundException ex) {
            System.err.println("Can't not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
