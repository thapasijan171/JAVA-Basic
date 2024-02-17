import java.util.Scanner;

public class RoundNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number and the number of decimal places
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        System.out.print("Enter the number of decimal places: ");
        int decimalPlaces = scanner.nextInt();

        // Round the number to n decimal places
        double roundedNumber = round(number, decimalPlaces);

        // Print the rounded number
        System.out.println("Rounded number: " + roundedNumber);

        scanner.close();
    }

    // Function to round a number to n decimal places
    public static double round(double number, int decimalPlaces) {
        double powerOfTen = Math.pow(10, decimalPlaces);
        return Math.round(number * powerOfTen) / powerOfTen;
    }
}
