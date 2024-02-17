// Write a program to print an integer entered by the user.



import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("You entered: " + number);

        scanner.close();
    }
}
