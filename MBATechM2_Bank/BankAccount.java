package aniruddh;

/**
 * Created by Aniruddh on 04-10-2017.
 */
public class BankAccount {

    String name;
    int acc_no;
    int date;

    public BankAccount(String name, double balance, int acc_no, int date){
        this.name = name;
        this.acc_no = acc_no;
        this.date = date;
    }

    public void displayProfile(){
        System.out.println("Name : " + name);
        System.out.println("Acc No : " + acc_no);
        System.out.println("Date : " + date);
    }
}
