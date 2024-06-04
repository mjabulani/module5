package org.example.figures;

public class Triangle implements GeometricFigure {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    @Override
    public double calculateArea() {
        return (height * base) / 2;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}
