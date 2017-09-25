package aniruddh.data;

import java.util.Scanner;

/**
 * Created by Aniruddh on 18-09-2017.
 */
public class Manager extends Employee{

    double commission, factor;

    public Manager(){
        System.out.print("Enter the commission of the employee : ");
        Scanner input = new Scanner(System.in);
        commission = input.nextDouble();
        factor = commission/100;
    }

    @Override
    double getSalary(){
        return (salary + salary*factor);
    }
}
