package aniruddh.shapes;

import aniruddh.interfaces.Color;
import aniruddh.interfaces.Shape;

import java.util.Scanner;

/**
 * Created by Aniruddh on 25-09-2017.
 */
public class Circle implements Shape, Color{

    int radius;
    double pi = 3.142;
    String col;

    public Circle(){
        getData();
    }

    public void getData(){
        System.out.println("Enter the radius of the circle : ");
        Scanner input = new Scanner(System.in);
        radius = input.nextInt();
        System.out.print("Enter the color of the circle : ");
        Scanner color = new Scanner(System.in);
        col = color.nextLine();
    }
    @Override
    public String color() {
        return col;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public int noOfSides() {
        return 0;
    }

    public void displayData() {
        System.out.println("Number of sides : " + noOfSides());
        System.out.println("Perimeter : " + perimeter());
        System.out.println("Area : " + area());
        System.out.println("Color : " + color());
    }
}
