package desktop;

public class Circle implements Shape {

    protected String name;
    protected float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return (2 * PI * radius);
    }

    @Override
    public void printResults() {
        System.out.println("Circle");
        System.out.println("Area of Circle: " + getArea());
        System.out.println("Primeter of Circle: " + getPerimeter());
    }
}
