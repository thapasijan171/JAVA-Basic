// Write a program to remove all whitespaces from the String.


import java.util.Scanner;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove whitespaces using regex
        String result = input.replaceAll("\\s", "");

        // Print the string without whitespaces
        System.out.println("String after removing whitespaces: " + result);

        scanner.close();
    }
}
