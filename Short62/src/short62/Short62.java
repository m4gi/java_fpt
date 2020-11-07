/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short62;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author Magi
 */
public class Short62 {

    static Scanner sc = new Scanner(System.in);

    private static String getExtension(String path) {
        int positionDot = path.lastIndexOf(".");
        return path.substring(positionDot, path.length());
    }

    private static String getFileName(String path) {
        int positionFrom = path.lastIndexOf("\\");
        int positionTo = path.lastIndexOf(".");
        return path.substring(positionFrom + 1, positionTo);
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Enter file path: ");
        String file = sc.nextLine();
        Path path = Paths.get(file);
        File check = new File(file);
        // D:\AT\Code\C\1.txt
//        if (check.isFile() && check.exists()) {
        System.out.println("----- Result Analysis -----");
        System.out.format("DISK: %s%n", path.getRoot());
        System.out.println("Extension: " + getExtension(file));
        System.out.println("File name: " + getFileName(file));
        System.out.format("Path: %s%n", path.getParent());
        System.out.format("Folders: ");

        for (int i = 0; i < path.getNameCount() - 1; i++) {
            System.out.format("[" + path.getName(i) + "] ");
        }

//            System.out.format("toString: %s%n", path.toString());
//            System.out.format("getFileName: %s%n", path.getFileName());
//            System.out.format("getNameCount: %d%n", path.getNameCount());
//            System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
//        } else {
//            System.out.println("File is not exists!");
//        }
    }
}
