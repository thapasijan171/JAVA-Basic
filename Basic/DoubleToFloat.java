// Write a program to convert double to float.


import java.util.Scanner;

public class DoubleToFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a double value
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Convert the double value to float
        float floatValue = (float) doubleValue;

        // Print the converted float value
        System.out.println("Float value: " + floatValue);

        scanner.close();
    }
}

