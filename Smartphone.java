public class Smartphone extends Product {
    private double weight;

    public Smartphone() {
        super();
    }

    public Smartphone(String id, String name, double price, double weight) {
        super(id, name, price);
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        // Weight must be positive
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Error: Weight must be greater than 0!");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Weight: %.2fg\n", weight);
    }
}