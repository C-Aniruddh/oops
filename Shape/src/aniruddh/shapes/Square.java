package aniruddh.shapes;

import aniruddh.interfaces.Color;
import aniruddh.interfaces.Shape;

/**
 * Created by Aniruddh on 25-09-2017.
 */
public class Square extends Quadrilateral implements Color, Shape {

    @Override
    public double area(){
        return sides[0]*sides[0];
    }
}
