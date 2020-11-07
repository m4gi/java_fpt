package short80;

import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Tetrahedron extends threeDimensionalShape {

    private double a;

    public Tetrahedron() {
    }

    public Tetrahedron(double a) {
        this.a = a;
    }

    public double getArea() {
        double resultArea = sqrt(3) * a * a;
        return resultArea;
    }

    public double getVolume() {

        NumberFormat formatter = new DecimalFormat("#0.00");
        double resultVolume = Double.parseDouble(formatter.format(1 * a * a * a * Math.sqrt(2) / 12));
        return resultVolume;
    }

}
