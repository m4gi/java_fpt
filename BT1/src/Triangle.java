import java.util.Scanner;

public class Triangle {

    public static void CheckTriangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("\nThe Triangle is Not a Valid Triangle\n");
        } else {
            System.out.println("\nThe Triangle is a Valid Triangle\n");
            System.out.println("Perimeter of triangle : " + (a + b + c));
            System.out.println("The area of the triangle is " + area_triangle(a, b, c));
            Triangle.KindTriangle(a, b, c);
        }
    }

    public static void KindTriangle(double a, double b, double c) {
        if (a == b && b == c)
            System.out.println("The kind of the triangle: Equilateral Triangle");
        else {
            if (a == b || b == c || c == a)
                System.out.println("The kind of the triangle: Isosceles Triangle");
            else
                System.out.println("The kind of the triangle: Scelen Traingle");
        }
        if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b)
            System.out.println("The kind of the triangle: Right Angle Triangle");
    }

    public static double area_triangle(double side1, double side2, double side3) {
        double area = 0;
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public static void main(String[] args) {
        double l1, l2, l3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of the first side: ");
        l1 = sc.nextDouble();
        System.out.print("Length of the second side: ");
        l2 = sc.nextDouble();
        System.out.print("Length of the third side: ");
        l3 = sc.nextDouble();
        Triangle.CheckTriangle(l1, l2, l3);
        sc.close();
    }
}
