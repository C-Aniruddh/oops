package aniruddh.shapes;

import aniruddh.interfaces.Color;
import aniruddh.interfaces.Shape;

import java.util.Scanner;

/**
 * Created by Aniruddh on 25-09-2017.
 */
public class Parallelogram extends Quadrilateral implements Color, Shape {

    int height;

    public Parallelogram(){
        Data();
    }

    public void Data(){
        System.out.print("Enter the height of the parallelogram : ");
        Scanner input = new Scanner(System.in);
        height = input.nextInt();
    }
    @Override
    public double area(){
        double a = sides[0] * height;
        return a;
    }
}
