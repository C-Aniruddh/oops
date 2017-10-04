package aniruddh;

import java.util.Scanner;

/**
 * Created by Aniruddh on 04-10-2017.
 */
public class Operations extends SavingsAccount {
    public Operations(String name, double balance, int acc_no, int date, double minimum_balance) {
        super(name, balance, acc_no, date, minimum_balance);
    }

    public void withdraw(){
        System.out.println("How much would you like to withdraw : ");
        Scanner scan_amount = new Scanner(System.in);
        double amount = scan_amount.nextDouble();
        balance = balance - amount;
        super.displayBalance();
    }

    public void deposit(){
        System.out.println("How much would you like to deposit : ");
        Scanner scan_amount = new Scanner(System.in);
        double amount = scan_amount.nextDouble();
        balance = balance + amount;
        super.displayBalance();
    }
}
