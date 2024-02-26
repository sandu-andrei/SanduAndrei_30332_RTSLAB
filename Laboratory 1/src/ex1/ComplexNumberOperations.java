package ex1;

import java.util.Scanner;

public class ComplexNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();

        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();

        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();

        System.out.println("Choose an operation: 1 for addition, 2 for subtraction, 3 for multiplication");
        int operation = scanner.nextInt();

        double resultReal = 0;
        double resultImaginary = 0;

        switch (operation) {
            case 1:  // Adunare
                resultReal = real1 + real2;
                resultImaginary = imaginary1 + imaginary2;
                break;
            case 2:  // Scadere
                resultReal = real1 - real2;
                resultImaginary = imaginary1 - imaginary2;
                break;
            case 3:  // Anmultire
                resultReal = real1 * real2 - imaginary1 * imaginary2;
                resultImaginary = real1 * imaginary2 + real2 * imaginary1;
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("The result is: " + resultReal + " + " + resultImaginary + "i");
    }
}
