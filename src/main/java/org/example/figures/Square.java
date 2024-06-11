package org.example.figures;

public class Square extends Rectangle {



    public Square(double a) {
        super(a, a);
    }

    public double calculateDiameter() {
        if (getA() > 0) {
            return super.getA() * Math.sqrt(2);
        } else {
            return 0;
        }
    }
}
