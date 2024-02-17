// Write a program to convert String to int. 



import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string representing an integer: ");
        String input = scanner.nextLine();

        try {
            // Convert the string to an integer
            int intValue = Integer.parseInt(input);
            
            // Print the converted integer
            System.out.println("Integer value: " + intValue);
        } catch (NumberFormatException e) {
            // Handle the case where the input cannot be converted to an integer
            System.out.println("Invalid input. Please enter a valid integer string.");
        }

        scanner.close();
    }
}
