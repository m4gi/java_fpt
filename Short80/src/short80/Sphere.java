package short80;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Sphere extends threeDimensionalShape {

    private double radius;

    public Sphere() {
    }

    public Sphere(int r) {
        this.radius = r;
    }

    public double getR() {
        return radius;
    }

    public void setR(int r) {
        this.radius = r;
    }

    public double getArea() {
        double resultArea = 4 * (3.14 * radius * radius);
        return resultArea;
    }

    public double getVolume() {

        NumberFormat formatter = new DecimalFormat("#0.00");
        double resultVolume = Double.parseDouble(formatter.format(4 * radius * radius * radius * Math.PI / 3));
        return resultVolume;
    }

}
