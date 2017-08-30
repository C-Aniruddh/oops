package aniruddh.shape;

import aniruddh.container.Point;

import java.awt.*;

/**
 * Created by Aniruddh on 21-08-2017.
 */
public class Rect {

    Point d1;
    Point d2;
    public void getData(){
        System.out.println("Enter the coordinates for diagonal 1 : ");
        d1 = new Point();
        System.out.println("Enter the coordinates for diagonal 2 : ");
        d2 = new Point();
    }

    // Get all points
    public static boolean getOverlap(Rect one, Rect two){
        if (one.d1.getX() > two.d2.getX() || two.d1.getX() > one.d2.getX()){
            return false;
        } if (one.d1.getY() < two.d2.getY() || two.d1.getY() < one.d2.getY()) {
            return false;
        }
        return true;
    }

    int getHeight(){
        return (d1.getY() - d2.getY());
    }

    int getWidth(){
        return (d2.getX() - d1.getX());
    }

    public static void getArea(Rect one, Rect two){
    Rectangle r1 = new Rectangle(one.d1.getX(), one.d1.getY(), one.getWidth(), one.getHeight());
    Rectangle r2 = new Rectangle(two.d1.getX(), two.d1.getY(), two.getWidth(), two.getHeight());
    Rectangle intersect = r1.intersection(r2);
    double h = intersect.getHeight();
    double w = intersect.getWidth();
    double area = h*w;
    System.out.println("The area of the intersection is equal to = " + String.valueOf(area) + " sq. units.");

    }

}
