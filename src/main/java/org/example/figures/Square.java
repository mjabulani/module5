package org.example.figures;

public class Square extends Rectangle {



    public Square(double a) {
        super(a, a);
    }

    public double calculateDiameter() {
        return super.getA() * Math.sqrt(2);

    }
}
