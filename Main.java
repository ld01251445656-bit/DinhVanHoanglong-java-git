import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<>();

        try {
            productList.add(new Laptop("L01", "MacBook Pro", 35000000, "Apple"));
            productList.add(new Laptop("L02", "Dell XPS", 30000000, "Dell"));
            productList.add(new Smartphone("S01", "iPhone 15", 25000000, 171));
            productList.add(new Smartphone("S02", "Galaxy S24", 22000000, 167));
            productList.add(new Tablet("T01", "iPad Pro", 28000000, 11.0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("--- PRODUCTS LIST ---");
        for (Product p : productList) {
            p.displayInfo();
        }
    }
}