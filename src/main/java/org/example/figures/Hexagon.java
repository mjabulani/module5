package org.example.figures;

public class Hexagon implements GeometricFigure {

    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return ((3 * Math.sqrt(3) * Math.pow(a, 2)))/2;
    }

    public double getA() {
        return a;
    }
}
