import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Get the current year
        int currentYear = LocalDate.now().getYear();

        // Calculate the age
        int age = currentYear - birthYear;

        // Print the age
        System.out.println("Your age is: " + age + " years");

        scanner.close();
    }
}
