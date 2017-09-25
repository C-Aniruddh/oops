package aniruddh.data;

import java.util.Scanner;

/**
 * Created by Aniruddh on 18-09-2017.
 */
public class WageEmployee extends Employee {
    double wage;

    public WageEmployee(){
        System.out.print("Enter the wage of the employee : ");
        Scanner input = new Scanner(System.in);
        wage = input.nextDouble();
    }

    @Override
    double getSalary(){
        return salary + wage;
    }
}
