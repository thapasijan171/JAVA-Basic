// Write a program to calculate the square of a number


import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the entered number from the user
        double number = scanner.nextDouble();

        // Calculate the square of the number
        double square = number * number;

        // Print the square of the number
        System.out.println("The square of " + number + " is: " + square);

        // Close the Scanner object to release system resources
        scanner.close();
    }
}
