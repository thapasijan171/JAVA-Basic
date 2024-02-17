//  to create a class Laptop with properties [id, name, ram] and



class Laptop {
    private int id;
    private String name;
    private int ram;

    public Laptop(int id, String name, int ram) {
        this.id = id;
        this.name = name;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }
}

public class LaptopDemo {
    public static void main(String[] args) {
        // Create three Laptop objects
        Laptop laptop1 = new Laptop(1, "Asus tuf F15", 16);
        Laptop laptop2 = new Laptop(2, "Rog Strix g16", 32);
        Laptop laptop3 = new Laptop(3, "MacBook", 16);

        // Print details of each laptop
        System.out.println("Laptop 1 Details:");
        System.out.println("ID: " + laptop1.getId());
        System.out.println("Name: " + laptop1.getName());
        System.out.println("RAM: " + laptop1.getRam());
        System.out.println();

        System.out.println("Laptop 2 Details:");
        System.out.println("ID: " + laptop2.getId());
        System.out.println("Name: " + laptop2.getName());
        System.out.println("RAM: " + laptop2.getRam());
        System.out.println();

        System.out.println("Laptop 3 Details:");
        System.out.println("ID: " + laptop3.getId());
        System.out.println("Name: " + laptop3.getName());
        System.out.println("RAM: " + laptop3.getRam());
    }
}
