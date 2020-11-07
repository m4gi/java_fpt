package short80;

public class Square extends twoDimensionalShape {

    private double a;

    public Square() {
    }

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea() {
        double result = a * a;
        return result;
    }
}
