
import java.io.*;
import java.util.Scanner;

public class EX3 {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        File f;
        f = new File(name);
        if (f.exists()) {
            System.out.println("Exists");
        } else {
            System.out.println("Does not Exists");
        }
    }
}
