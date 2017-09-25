package aniruddh.shapes;

import aniruddh.interfaces.Color;
import aniruddh.interfaces.Shape;

import java.util.Scanner;

/**
 * Created by Aniruddh on 25-09-2017.
 */
public class Quadrilateral implements Shape, Color {

    int numSides = 4;
    int sides[] = new int[4];
    String col;

    public Quadrilateral(){
        getData();
    }

    public void getData(){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<numSides; i++){
            System.out.print("Enter the length of side " + String.valueOf(i+1) + ": ");
            sides[i] = input.nextInt();
        }
        System.out.print("Enter the color of the shape : ");
        Scanner color = new Scanner(System.in);
        col = color.nextLine();
    }
    @Override
    public String color() {
        return col;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        int p = 0;
        for (int i=0; i<numSides;i++){
            p = p + sides[i];
        }
        return p;
    }

    @Override
    public int noOfSides() {
        return numSides;
    }

    public void displayData() {
        System.out.println("Number of sides : " + noOfSides());
        System.out.println("Perimeter : " + perimeter());
        System.out.println("Area : " + area());
        System.out.println("Color : " + color());
    }
}
