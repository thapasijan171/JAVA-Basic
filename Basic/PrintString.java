// Write a program to print String entered by the user.


import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);

        scanner.close();
    }
}
