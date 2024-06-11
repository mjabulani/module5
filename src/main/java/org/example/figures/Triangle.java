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
        if (height > 0 && base > 0) {
            return (height * base) / 2;
        }
        return 0;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}
