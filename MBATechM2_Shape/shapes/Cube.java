package aniruddh.shapes;

import aniruddh.interfaces.Shape;

/**
 * Created by Aniruddh on 04-10-2017.
 */
public class Cube implements Shape {
    int side;

    public Cube(int side){
        this.side = side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public double surface_area() {
        return 6*side*side;
    }
}
