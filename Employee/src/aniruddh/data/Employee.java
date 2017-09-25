package aniruddh.data;

import aniruddh.util.Date;

import java.util.Scanner;

/**
 * Created by Aniruddh on 18-09-2017.
 */

public class Employee {
    String employeeID;
    String employeeName;
    double salary;
    Date joiningDate;

    public Employee(){
        getData();
    }

    void getData(){
        System.out.print("Enter the name of the employee : ");
        Scanner input = new Scanner(System.in);
        employeeName = input.nextLine();
        System.out.print("Enter the employee ID : ");
        employeeID = input.nextLine();
        System.out.print("Enter the salary of the employee : ");
        salary = input.nextDouble();
        System.out.print("Enter the joining date : ");
        int date = input.nextInt();
        System.out.print("Enter the joining month : ");
        int month = input.nextInt();
        System.out.print("Enter the joining year : ");
        int year = input.nextInt();
        joiningDate = new Date(date, month, year);
    }

    public void showInfo(){
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Employee Salary : " + String.valueOf(getSalary()));
        System.out.println("Employee Joining Year : " + joiningDate.getDate());
    }

    double getSalary(){
        return salary;
    }
}
