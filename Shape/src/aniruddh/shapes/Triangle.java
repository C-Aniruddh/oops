package aniruddh.shapes;

import aniruddh.interfaces.Color;
import aniruddh.interfaces.Shape;

import java.util.Scanner;

/**
 * Created by Aniruddh on 25-09-2017.
 */
public class Triangle implements Shape, Color {

    int height, base, side;
    String col;

    public Triangle(){
        getData();
    }

    public void getData(){
        System.out.print("Enter the height of triangle : ");
        Scanner input = new Scanner(System.in);
        height = input.nextInt();
        System.out.print("Enter the base of triangle : ");
        base = input.nextInt();
        System.out.print("Enter the third side of triangle : ");
        side = input.nextInt();
        System.out.print("Enter the color of triangle : ");
        Scanner color = new Scanner(System.in);
        col = color.nextLine();
    }
    @Override
    public String color() {
        return col;
    }

    @Override
    public double area() {
        return (0.5*base*height);
    }

    @Override
    public double perimeter() {
        return (height + base + side);
    }

    @Override
    public int noOfSides() {
        return 3;
    }

    public void displayData() {
        System.out.println("Number of sides : " + noOfSides());
        System.out.println("Perimeter : " + perimeter());
        System.out.println("Area : " + area());
        System.out.println("Color : " + color());
    }
}
