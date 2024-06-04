package org.example;

import org.example.figures.Hexagon;
import org.example.figures.Rectangle;
import org.example.figures.Square;
import org.example.figures.Triangle;
import org.example.files.Directory;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Calc area
        Rectangle rect = new Rectangle(5, 7);
        Triangle trian = new Triangle(12, 33);
        Hexagon hex = new Hexagon(11.32);
        System.out.println("Rectangle area (A: " + rect.getA() + ", B: " + rect.getB() + "): " + rect.calculateArea());
        System.out.println("Triangle area (Height: " + trian.getHeight() + ", Base: " + trian.getBase()+ "):" + trian.calculateArea());
        System.out.println("Hexagon area: (A: " + hex.getA() + "): " + hex.calculateArea());

        // Calc diameter of square
        Square sq = new Square(5);
        System.out.println("Square diamtere: " + sq.calculateDiameter());

        // Print path
        Directory d = new Directory();
        d.printDirectory("src/main/resources");

        // Create new file
        //System.out.println("Creating file..." + d.createNewFile());

        // Read from file
        System.out.println(d.readFromFile("src/main/resources/testowyPlik.json"));

        /// Are files equal?
        File f1 = new File("src/main/resources/Test.txt");
        File f2 = new File("src/main/resources/a.txt");
        System.out.println("Are files equal?: " + d.areTextFilesEqual(f1, f2));

        d.invertFile(f2);
    }


}