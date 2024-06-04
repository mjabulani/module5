package org.example.figures;

public class Square extends Rectangle {

    private int a;

    public Square(int a) {
        super(a, a);
        this.a = a;
    }

    public double calculateDiameter() {
        return a * Math.sqrt(2);
    }
}
