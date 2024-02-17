public class MultiplicationTable {
    public static void main(String[] args) {
        int multiplier = 5;
        int limit = 10; // Change limit if you want to generate a larger table

        System.out.println("Multiplication Table of " + multiplier + ":");

        // Loop to generate and print the multiplication table
        for (int i = 1; i <= limit; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " * " + i + " = " + result);
        }
    }
}
