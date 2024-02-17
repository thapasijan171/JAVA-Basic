import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Calculate the sum of natural numbers from 1 to n
        int sum = calculateSum(n);

        // Print the sum
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }

    // Function to calculate the sum of natural numbers from 1 to n
    public static int calculateSum(int n) {
        // Formula for the sum of first n natural numbers: sum = n * (n + 1) / 2
        return n * (n + 1) / 2;
    }
}
