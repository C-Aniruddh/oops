package aniruddh.shapes;

import aniruddh.interfaces.Color;
import aniruddh.interfaces.Shape;

import java.util.Scanner;

/**
 * Created by Aniruddh on 25-09-2017.
 */
public class Trapezium extends Quadrilateral implements Color, Shape {

    int a, b, height;
    public Trapezium(){
        Data();
    }

    public void Data(){
        System.out.print("Enter the height of the trapezium : ");
        Scanner input = new Scanner(System.in);
        height = input.nextInt();
        System.out.print("Enter the length of base of the trapezium : ");
        b = input.nextInt();
        System.out.print("Enter the length of upper side of the trapezium : ");
        a = input.nextInt();
    }

    @Override
    public double area(){
        return ((a + b) * height) / 2;
    }
}
