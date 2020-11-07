
package abc;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.util.Scanner;

public class Atoms {
    Scanner sc = new Scanner(System.in);
    int n, i, max;
    int[] num = new int[118];
    float[] weight = new float[118];
    String[] symbol = new String[118];
    String[] name = new String[118];

    void accept() {
        Arrays.fill(num, 0);
        i = 0;
        max = 0;
        do {
            System.out.print("Enter atomic number : ");
            n = sc.nextInt();
            if (n > max)
                max = n;
            if (n == 0)
                break;
            num[n] = n;
            System.out.print("Enter symbol : ");
            symbol[n] = sc.next();
            System.out.print("Enter full name : ");
            name[n] = sc.next();
            System.out.print("Enter atomic weight :");
            weight[n] = sc.nextFloat();
            i++;
        } while (i <= 10);
    }

    void display() {
        for (i = 0; i <= max; i++) {
            if (num[i] != 0)
                System.out.println(num[i] + "\t" + symbol[i] + "\t" + name[i] + "\t" + weight[i]);
        }
    }

    public static void main(String[] args) {
        Atoms obj = new Atoms();
        System.out.println("Atomic Information");
        System.out.println("==================");
        obj.accept();
        obj.display();
    }
}