public class GenderEnumExample {
    // Enum for Gender
    enum Gender {
        MALE,
        FEMALE,
        OTHERS
    }

    // Main method
    public static void main(String[] args) {
        // Print all values of the Gender enum
        System.out.println("All values of Gender:");
        for (Gender gender : Gender.values()) {
            System.out.println(gender);
        }
    }
}
