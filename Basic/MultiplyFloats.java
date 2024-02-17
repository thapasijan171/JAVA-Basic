// Write a program to multiply two floating-point numbers.



import java.util.Scanner;

public class MultiplyFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();

        float result = num1 * num2;

        System.out.println("Result of multiplication: " + result);

        scanner.close();
    }
}
