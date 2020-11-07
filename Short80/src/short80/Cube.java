package short80;

public class Cube extends threeDimensionalShape {

    private double a;

    public Cube() {
    }

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea() {
        double resultArea = 6 * a * a;
        return resultArea;
    }

    public double getVolume() {
        double resultVolume = a * a * a;
        return resultVolume;
    }

}
