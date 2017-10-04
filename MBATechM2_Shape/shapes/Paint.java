package aniruddh.shapes;

import aniruddh.interfaces.Shape;

import java.util.Scanner;

/**
 * Created by Aniruddh on 04-10-2017.
 */
public class Paint extends Cube implements Shape {

    int material;
    double cost;

    public void getMaterial(){
        System.out.println("Which Material?");
        System.out.println("1. Wood");
        System.out.println("2. Metallic");
        System.out.println("3. Acrylic");
        Scanner scan = new Scanner(System.in);
        material = scan.nextInt();
    }

    public Paint(int side) {
        super(side);
        getMaterial();
        cost = calcCost();
    }

    public double calcCost(){
        double c;
        if (material == 1){
            c = 5*surface_area();
        } else if (material == 2){
            c = 6*surface_area();
        } else {
            c = 10*surface_area();
        }
        return c;
    }

    public void display(){
        System.out.println("Cost of printing : " + cost);
    }
}
