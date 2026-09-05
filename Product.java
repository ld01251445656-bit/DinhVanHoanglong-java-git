public class Product {
    private String id;
    private String name;
    private double price;


    public Product() {
    }

    // Parameterized constructor
    public Product(String id, String name, double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    // Getters and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Product ID cannot be empty!");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Product Name cannot be empty!");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
        throw new IllegalArgumentException("Error: Price cannot be negative!");
        }
        this.price = price;
    }

    
    public void displayInfo() {
        System.out.printf("ID: %-6s | Name: %-18s | Price: %,.0f VND", id, name, price);
    }
}
// end of Product exactly