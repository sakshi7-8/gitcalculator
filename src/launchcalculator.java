import java.util.Scanner;
//this is a updated program
public class launchcalculator {

    // Addition
    static double addition(double a, double b) {
        return a + b;
    }

    // Subtraction
    static double subtraction(double a, double b) {
        return a - b;
    }

    // Multiplication
    static double multiplication(double a, double b) {
        return a * b;
    }

    // Division
    static double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Addition = " + addition(a, b));
        System.out.println("Subtraction = " + subtraction(a, b));
        System.out.println("Multiplication = " + multiplication(a, b));

        if (b != 0)
            System.out.println("Division = " + division(a, b));
        else
            System.out.println("Division is not possible by zero.");

        sc.close();
    }
}