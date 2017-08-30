package type;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Aniruddh on 24-07-2017.
 */
public class Complex {

    double real, imaginary;

    public void read(){
        //Scan real
        System.out.print("Enter the real part of the complex number : ");
        Scanner scan_real = new Scanner(System.in);
        try{
            real = scan_real.nextDouble();
        } catch (InputMismatchException e){
            System.out.print(e.getMessage());
            System.exit(5);
        }

        //Scan Imaginary
        System.out.print("Enter the imaginary part of the complex number : ");
        Scanner scan_imag = new Scanner(System.in);
        try {
            imaginary = scan_imag.nextDouble();
        } catch (InputMismatchException e ){
            System.out.print(e.getMessage());
            System.exit(5);
        }
    }

    public void display(){
        if (imaginary < 0){
            System.out.println("The complex number is " + real + imaginary + "i");
        } else {
            System.out.println("The complex number is " + real + " + i" + imaginary);
        }
    }

    /*public static void subtract(Complex c1, Complex c2) {
        //Compute
        int new_real = c1.real - c2.real;
        int new_imag = c1.imaginary - c2.imaginary;

        //Display
        if (new_imag < 0) {
            System.out.println("The difference of the two complex numbers is : " + new_real + new_imag + "i");
        } else {
            System.out.println("The difference of the two complex numbers is : " + new_real + " + i" + new_imag);
        }
    }

    public static void add (Complex c1, Complex c2){
        //Compute
        int new_real = c1.real + c2.real;
        int new_imag = c1.imaginary + c2.imaginary;
        //Display
        if (new_imag < 0 ) {
            System.out.println("The sum of the two complex numbers is : " + new_real + new_imag + "i");
        } else {
            System.out.println("The sum of the two complex numbers is : " + new_real + " + i" + new_imag);
        }

    }*/

    // Pass objects

    public Complex conjugate(Complex c1){
        Complex conj = new Complex();
        conj.real = c1.real;
        conj.imaginary = -c1.imaginary;
        return conj;
    }

    public double modulus (Complex c1){
        double mod = Math.sqrt((c1.real*c1.real) + (c1.imaginary*c1.imaginary));
        return mod;
    }
    public Complex add (Complex c1, Complex c2){
        Complex addition = new Complex(); // create an addition object
        addition.real = c1.real + c2.real;
        addition.imaginary = c1.imaginary + c2.imaginary;
        return addition;
    }

    public Complex subtract (Complex c1, Complex c2){
        Complex subtraction = new Complex();
        subtraction.real = c1.real - c2.real;
        subtraction.imaginary = c1.imaginary - c2.imaginary;
        return subtraction;
    }

    public Complex multiply(Complex c1, Complex c2){
        Complex multiplication = new Complex();
        multiplication.real = (c1.real*c2.real - c1.imaginary*c2.imaginary);
        multiplication.imaginary = (c1.real*c2.imaginary + c1.imaginary*c2.real);
        return multiplication;
    }

    public Complex divide(Complex c1, Complex c2){
        Complex division = new Complex();
        double denom = c2.real*c2.real + c2.imaginary*c2.imaginary;
        division.real = ((c1.real*c2.real + c1.imaginary*c2.imaginary) / denom);
        division.imaginary = ((c1.imaginary*c2.real - c1.real*c2.imaginary) / denom);
        return division;
    }

    public double angle(Complex c1){
        // x = rcos(theta) == theta = acos(r/x)
        double ang = Math.acos(modulus(c1)/c1.real);
        return ang;
    }
}
