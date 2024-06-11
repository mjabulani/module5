package org.example.figures;

public class Hexagon implements GeometricFigure {

    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        if (a > 0) {
            return ((3 * Math.sqrt(3) * Math.pow(a, 2)))/2;
        } else {
            return 0;
        }
    }

    public double getA() {
        return a;
    }
}
