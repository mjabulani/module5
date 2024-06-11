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
        return a*b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
