import java.util.Scanner;

public class launchcalculator {

    public static void addition() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scan.nextInt();

        System.out.println("Enter second number:");
        int b = scan.nextInt();

        int c = a + b;
        System.out.println("Result = " + c);
    }

    public static void subtraction() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scan.nextInt();

        System.out.println("Enter second number:");
        int b = scan.nextInt();

        int c = a - b;
        System.out.println("Result = " + c);
    }

    public static void multiplication() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scan.nextInt();

        System.out.println("Enter second number:");
        int b = scan.nextInt();

        int c = a * b;
        System.out.println("Result = " + c);
    }

    public static void division() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scan.nextInt();

        System.out.println("Enter second number:");
        int b = scan.nextInt();

        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            int c = a / b;
            System.out.println("Result = " + c);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter your choice:");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                addition();
                break;

            case 2:
                subtraction();
                break;

            case 3:
                multiplication();
                break;

            case 4:
                division();
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scan.close();
    }
}
