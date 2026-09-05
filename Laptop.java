public class Laptop extends Product {
    private String brand;

    public Laptop() {
        super();
    }

    public Laptop(String id, String name, double price, String brand) {
        super(id, name, price);
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        // Only accept specific predefined brands
        String brandCheck = brand.toLowerCase();
        if (brandCheck.equals("apple") || brandCheck.equals("dell") ||
            brandCheck.equals("hp") || brandCheck.equals("asus") || brandCheck.equals("lenovo")) {
            this.brand = brand;
        } else {
            throw new IllegalArgumentException("Error: Invalid brand. Allowed brands: Apple, Dell, HP, Asus, Lenovo.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Brand: %s\n", brand);
    }
}