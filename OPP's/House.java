import java.util.ArrayList;
import java.util.List;

public class House {
    private int id;
    private String name;
    private double price;

    // Constructor
    public House(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Main method
    public static void main(String[] args) {
        // Create objects of House class
        House house1 = new House(1, "Villa", 500000.00);
        House house2 = new House(2, "Apartment", 300000.00);
        House house3 = new House(3, "Bungalow", 700000.00);

        // Create a list to store House objects
        List<House> houseList = new ArrayList<>();

        // Add House objects to the list
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        // Print details of all houses in the list
        System.out.println("Details of all houses:");
        for (House house : houseList) {
            System.out.println("ID: " + house.getId());
            System.out.println("Name: " + house.getName());
            System.out.println("Price: $" + house.getPrice());
            System.out.println();
        }
    }
}
