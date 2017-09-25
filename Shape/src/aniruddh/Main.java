package aniruddh;

import aniruddh.shapes.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        System.out.println("Which shape do you want to create?");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Trapezium");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        switch(choice){
            case 1:
                Circle circle = new Circle();
                circle.displayData();
                break;
            case 2:
                Rectangle rect = new Rectangle();
                rect.displayData();
                break;
            case 3:
                Square square = new Square();
                square.displayData();
                break;
            case 4:
                Triangle triangle = new Triangle();
                triangle.displayData();
                break;
            case 5:
                Parallelogram para = new Parallelogram();
                para.displayData();
                break;
            case 6:
                Trapezium trap = new Trapezium();
                trap.displayData();
                break;
            default:
                System.out.println("Enter a valid option.");
                break;
        }
    }
}
