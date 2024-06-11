package org.example.figures;

public class Rectangle implements GeometricFigure {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        if (a > 0 && b > 0) {
            return a*b;
        } else {
            return 0;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
