package aniruddh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Operations ops = new Operations("Name", 10000, 1234, 12, 100);
        ops.deposit();
        ops.withdraw();
        ops.displayProfile();
    }
}
