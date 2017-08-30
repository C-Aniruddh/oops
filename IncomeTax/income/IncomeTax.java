package income;

import java.util.Scanner;

/**
 * Created by Aniruddh on 07-08-2017.
 */

public class IncomeTax {

    private double basicSalary, dearnessAllowance, hra, conveyance, grossSalary;
    private double tax_yearly, tax_monthly;
    private String name, city;
    private String tier;

    public void getData(){
        System.out.print("Enter your name : ");
        Scanner name_scan = new Scanner(System.in);
        name = name_scan.nextLine();
        System.out.print("Enter your basic salary (yearly) : ");
        Scanner bs_scan = new Scanner(System.in);
        basicSalary = bs_scan.nextDouble();
        System.out.print("Enter the name of the city : ");
        Scanner city_scanner = new Scanner(System.in);
        city = city_scanner.nextLine();
        setData();
    }

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Basic Salary : " + String.valueOf(basicSalary));
        System.out.println("Dearness Allowance : " + String.valueOf(dearnessAllowance));
        System.out.println("Conveyance Allowance : " + String.valueOf(conveyance));
        System.out.println("HRA : " + String.valueOf(hra));
        System.out.println("Gross Salary : " + String.valueOf(grossSalary));
        System.out.println("City Tier : " + String.valueOf(tier));
        System.out.println("Yearly Tax : " + String.valueOf(tax_yearly));
        System.out.println("Monthly Tax : " + String.valueOf(tax_monthly));
    }

    private void setData(){
        dearnessAllowance = calcDA();
        hra = calcHRA();
        conveyance = calcConv();
        grossSalary = groSalary();
        tax_yearly = yearlyTax();
        tax_monthly = monthlyTax();
    }
    /* Calculation methods */

    private double calcDA(){
        return (basicSalary*0.30);
    }

    private double calcHRA(){
        if (city.contentEquals("Mumbai") || city.contentEquals("Kolkata") || city.contentEquals("Delhi") || city.contentEquals("Chennai")){
            tier = "A";
            hra = basicSalary * 0.30;
        } else if (city.contentEquals("Pune") || city.contentEquals("Bangalore") || city.contentEquals("Nasik") || city.contentEquals("Nagpur")){
            tier =  "B";
            hra = basicSalary * 0.20;
        } else{
            tier = "C";
            hra = basicSalary * 0.10;
        }
        return hra;
    }

    private double calcConv(){
        return 1800*12;
    }

    private double groSalary(){
        return (basicSalary + dearnessAllowance + hra + conveyance);
    }

    private double yearlyTax(){
        double tax, tax1, tax2, tax3;
        double temp_salary_b1, temp_salary_b2, temp_salary_b3;
        if (grossSalary > 0 && grossSalary < 249999){
            tax = 0;
        } else if (grossSalary >= 250000 && grossSalary <= 500000){
            temp_salary_b1 = grossSalary - 250000;
            tax = temp_salary_b1 * 0.05;
        } else if (grossSalary > 500000 && grossSalary <= 1000000){
            temp_salary_b1 = grossSalary - 250000;
            tax1 = temp_salary_b1*0.05;
            temp_salary_b2 = grossSalary - 500000;
            tax2 = temp_salary_b2*0.20;
            tax = tax1 + tax2;
        } else  {
            temp_salary_b1 = grossSalary - 250000;
            tax1 = temp_salary_b1*0.05;
            temp_salary_b2 = grossSalary - 500000;
            tax2 = temp_salary_b2*0.20;
            temp_salary_b3 = grossSalary - 1000000;
            tax3 = temp_salary_b3*0.30;
            tax = tax1 + tax2 + tax3;
        }
        return tax;
    }

    private double monthlyTax(){
        return (yearlyTax()/12);
    }

}
