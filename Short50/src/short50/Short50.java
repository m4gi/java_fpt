package short50;

import java.util.Scanner;

public class Short50 {

    public static int choices() {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("\n=================MENU================\n");
        System.out.println("1. Solving Equavation 1.");
        System.out.println("2. Solving Equavation 2.");
        System.out.println("3. Square number.");
        System.out.print("Choice:");
        choice = sc.nextInt();
        return choice;
    }

    public static void EQ1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Vô Số Nghiệm");
            } else {
                System.out.println("Vô Nghiệm");
            }
        } else {
            double x;
            x = -b / a;
            System.out.println("Nghiệm là " + x);
        }
    }

    public static void EQ2(double a, double b, double c) {
        if (a == 0) {
            EQ1(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            double x1;
            double x2;
            if (delta > 0) {
                x1 = ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }

    public static boolean check_square(int n) {
        int temp = (int) Math.sqrt(n);
        if (temp * temp == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            option = choices();
            switch (option) {
                case 1:
                    System.out.println("Enter a: ");
                    double a = sc.nextDouble();
                    System.out.println("Enter b: ");
                    double b = sc.nextDouble();
                    EQ1(a, b);
                    break;
                case 2:
                    System.out.println("Enter a: ");
                    a = sc.nextDouble();
                    System.out.println("Enter b: ");
                    b = sc.nextDouble();
                    System.out.println("Enter c: ");
                    double c = sc.nextDouble();
                    EQ2(a, b, c);
                case 3:
                    System.out.println("Enter first number: ");
                    int st = sc.nextInt();
                    System.out.println("Enter last number: ");
                    int ls = sc.nextInt();
                    System.out.println("Square number: ");
                    for (int i = st; i <= ls; i++) {
                        if (check_square(i)) {
                            System.out.print(i + " ");
                        }
                    }
            }
        } while (option < 4);

    }

}
