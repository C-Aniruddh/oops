package aniruddh.data;

import java.util.Scanner;

/**
 * Created by Aniruddh on 18-09-2017.
 */
public class SalesManager extends Manager{

    double incentive, incentive_factor;

    public SalesManager(){
        System.out.print("Enter the incentive of the employee : ");
        Scanner input = new Scanner(System.in);
        incentive = input.nextDouble();
        incentive_factor = incentive/100;
    }

    @Override
    double getSalary(){
        return (salary + salary*factor + salary*incentive_factor);
    }
}
