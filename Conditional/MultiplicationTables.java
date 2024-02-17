public class MultiplicationTables {
    public static void main(String[] args) {
        int start = 1;
        int end = 9;

        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication Table of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // Empty line between tables
        }
    }
}
