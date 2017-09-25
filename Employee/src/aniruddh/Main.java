package aniruddh;

import aniruddh.data.Employee;
import aniruddh.data.Manager;
import aniruddh.data.SalesManager;
import aniruddh.data.WageEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;

        System.out.println("Which employee do you want to create? : ");
        Scanner input  = new Scanner(System.in);
        System.out.println("1. Normal Employee");
        System.out.println("2. Wage Employee");
        System.out.println("3. Manager");
        System.out.println("4. Sales Manager");
        System.out.print("Enter your choice : ");
        choice = input.nextInt();
        switch(choice){
            case 1:
                Employee emp = new Employee();
                emp.showInfo();
                break;
            case 2:
                WageEmployee wage_emp = new WageEmployee();
                wage_emp.showInfo();
                break;
            case 3:
                Manager man = new Manager();
                man.showInfo();
                break;
            case 4:
                SalesManager sales_manager = new SalesManager();
                sales_manager.showInfo();
                break;
            default:
                System.out.println("Enter a valid option. Stop.");
                break;
        }
    }
}
