/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short61;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Short61 {
    
    static Scanner in = new Scanner(System.in);
    
    static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }
    
    static Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.err.println("Re-input");
            }
        }
    }
    
    static Rectangle inputRectangle() {
        while (true) {
            System.out.print("Please width of Rectangle: ");
            double width = checkInputDouble();
            System.out.print("Please height of Rectangle: ");
            double height = checkInputDouble();
            return new Rectangle(width, height);
        }
    }
    
    static Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = checkInputDouble();
        return new Circle(radius);
    }
    
    static void Display(Triangle triangle, Circle circle, Rectangle rectangle) {
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
    
    public static void main(String[] args) {
        Rectangle rectangle = inputRectangle();
        Circle circle = inputCircle();
        Triangle triangle = inputTriangle();
        Display(triangle, circle, rectangle);
    }
    
}
