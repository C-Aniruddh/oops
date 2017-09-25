package aniruddh.shapes;

import aniruddh.interfaces.Color;
import aniruddh.interfaces.Shape;

/**
 * Created by Aniruddh on 25-09-2017.
 */
public class Rectangle extends Quadrilateral implements Color, Shape {

    @Override
    public double area(){
        int a;
        if (sides[0] == sides[1]){
            a = sides[0] * sides[2];
        } else {
            a = sides[0] * sides[1];
        }
        return a;
    }
}
