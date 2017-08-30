package aniruddh;

import aniruddh.shape.Rect;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Rect a = new Rect();
        a.getData();
        Rect b = new Rect();
        b.getData();

        boolean overlap = Rect.getOverlap(a, b);
        if (overlap){
            System.out.println("Rectangles Overlap");
            Rect.getArea(a,b);
        } else {
            System.out.println("Rectangles do not Overlap");
        }
    }
}
