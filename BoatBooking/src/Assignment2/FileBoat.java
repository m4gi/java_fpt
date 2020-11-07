/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileBoat {

    static Scanner sc = new Scanner(System.in);

    void save(NodeBoat p) {

    }

    public static void outputFile(BSTBoat bstb, FileWriter out, NodeBoat p) throws IOException {

        if (p != null) {
            outputFile(bstb, out, p.left);

            String bcode = p.bu.getBcode().toString();
            out.write(bcode + "|");
            String boatName = p.bu.getBoatName().toString();
            out.write(boatName + "|");
            String seat = String.valueOf(p.bu.getSeat());
            out.write(seat + "|");
            String booked = String.valueOf(p.bu.getBooked());
            out.write(booked + "|");
            String departPlace = String.valueOf(p.bu.getDepartPlace());
            out.write(departPlace + "|");
            String arrivalTime = String.valueOf(p.bu.getArrivalTime());
            out.write(arrivalTime + "|");

            outputFile(bstb, out, p.right);

        }

    }

    public static void saveDataToFile(BSTBoat bstb) throws IOException {
        while (true) {
            System.err.println("Do you want to create a new save file?(Y/N)");
            boolean answer;
            String c = sc.nextLine();
            if ("y".equals(c) || "Y".equals(c)) {
                answer = true;
            } else {
                answer = false;
            }
            System.out.print("Enter the file name to save data : ");
            String nameFile = sc.nextLine().trim();
            if (answer == true) {
                File file = new File(nameFile);
                file.createNewFile();
                File listFile = new File(nameFile);
                Scanner readList = new Scanner(listFile);
                FileWriter out;
                out = new FileWriter(nameFile);
                if (file.exists()) {
                    System.err.println("<File is created>");
                    FileBoat.outputFile(bstb, out, bstb.root);
                    out.flush();
                    out.close();
                    System.err.println("<Saved Successfully!>");
                    break;
                } else {
                    System.err.println("<File already exists!>");
                }
            } else {
                try {
                    File listFile = new File(nameFile);
                    Scanner readList = new Scanner(listFile);
                    FileWriter out;
                    out = new FileWriter(nameFile);
                    FileBoat.outputFile(bstb, out, bstb.root);
                    out.flush();
                    out.close();
                    System.err.println("<Saved Successfully!>");
                    break;
                } catch (Exception e) {
                }
                System.err.println("<Your file doesn't exist. Please re-input!>");
            }
        }
    }
}
