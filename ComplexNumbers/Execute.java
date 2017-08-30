import type.Complex;

import java.util.Scanner;

/**
 * Created by Aniruddh on 24-07-2017.
 */

public class Execute {

    public static void main(String args[]) {
        //Create new complex numbers
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        //Read
        c1.read();
        c2.read();

        //Display
        System.out.println("You have entered the following complex numbers : ");
        c1.display();
        c2.display();

        int choice;
        System.out.print("Which of the following actions do you want to perform?\n" + "\t1. Add \n" + "\t2. Subtract \n" + "\t3. Multiply \n" + "\t4. Divide \n" + "\t5. Modulus \n" + "\t6. Conjugate \n" + "\t7. Angle \n" + "\t Enter your choice : ");
        Scanner scan_choice = new Scanner(System.in);
        choice = scan_choice.nextInt();
        switch (choice) {
            case 1:
                Complex sum;
                sum = c1.add(c1, c2);
                sum.display();
                break;
            case 2:
                Complex difference;
                difference = c1.subtract(c1, c2);
                difference.display();
                break;
            case 3:
                Complex multiply;
                multiply = c1.multiply(c1,c2);
                multiply.display();
                break;
            case 4:
                Complex divide;
                divide = c1.divide(c1,c2);
                divide.display();
                break;
            case 5:
                int subchoice;
                System.out.println("Would you like to compute C1 or C2 :");
                Scanner subc = new Scanner(System.in);
                subchoice = subc.nextInt();
                switch (subchoice){
                    case 1:
                        double mod = c1.modulus(c1);
                        System.out.println("Modulus = " + mod);
                        break;
                    case 2:
                        mod = c1.modulus(c1);
                        System.out.println("Modulus = " + mod);
                        break;
                }
                break;
            case 6:
                System.out.println("Would you like to compute C1 or C2 :");
                subc = new Scanner(System.in);
                subchoice = subc.nextInt();
                switch (subchoice){
                    case 1:
                        Complex conjugate;
                        conjugate = c1.conjugate(c1);
                        conjugate.display();
                        break;
                    case 2:
                        conjugate = c1.conjugate(c2);
                        conjugate.display();
                        break;
                }
                break;
            case 7:
                System.out.println("Would you like to compute C1 or C2 :");
                subc = new Scanner(System.in);
                subchoice = subc.nextInt();
                switch (subchoice){
                    case 1:
                        double angle = c1.angle(c1);
                        System.out.println("Angle =" +  angle);
                        break;
                    case 2:
                        angle = c1.angle(c2);
                        System.out.println("Angle =" +  angle);
                        break;
                }
                break;
        }

    }

}
