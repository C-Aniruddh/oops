package aniruddh.container;

import java.util.Scanner;

/**
 * Created by Aniruddh on 21-08-2017.
 */
public class Point {
    int x, y;

    public Point(){
        System.out.print("Enter the x coordinate : ");
        Scanner x_scan = new Scanner(System.in);
        x = x_scan.nextInt();
        System.out.print("Enter the y coordinate : ");
        Scanner y_scan = new Scanner(System.in);
        y = y_scan.nextInt();
    }

    public Point(int a, int b){
        x = a;
        y = b;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}
