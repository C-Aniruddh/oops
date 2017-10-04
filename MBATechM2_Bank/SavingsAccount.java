package aniruddh;

/**
 * Created by Aniruddh on 04-10-2017.
 */
public class SavingsAccount extends BankAccount {
    double minimum_balance;
    double balance;

    public SavingsAccount(String name, double balance, int acc_no, int date, double minimum_balance) {
        super(name, balance, acc_no, date);
        this.minimum_balance = minimum_balance;
        this.balance = balance;
    }

    public void displayBalance(){
        System.out.println("Balance : " + balance);
    }
}
