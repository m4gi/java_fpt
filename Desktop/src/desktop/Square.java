/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop;

public class Square implements Shape {

    protected float edge;
    protected String name;

    public Square() {
    }

    public Square(float edge) {
        this.edge = edge;
    }

    @Override
    public float getArea() {
        return (edge * edge);
    }

    @Override
    public float getPerimeter() {
        return (4 * edge);
    }

    @Override
    public void printResults() {
        System.out.println("Square");
        System.out.println("Area of Squre: " + getArea());
        System.out.println("Primeter of Square: " + getPerimeter());
    }
}
