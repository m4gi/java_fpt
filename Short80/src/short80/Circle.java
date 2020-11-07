package short80;

public class Circle extends twoDimensionalShape {

    private double radius;

    public Circle() {
    }

    public Circle(int r) {
        this.radius = r;
    }

    public double getR() {
        return radius;
    }

    public void setR(int r) {
        this.radius = r;
    }

    public double getArea() {
        double result = 3.14 * radius * radius;
        return result;
    }

}
