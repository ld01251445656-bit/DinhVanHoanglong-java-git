public class Tablet extends Product {
    private double screenSize;

    public Tablet() {
        super();
    }

    public Tablet(String id, String name, double price, double screenSize) {
        super(id, name, price);
        setScreenSize(screenSize);
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        // Typical screen sizes
        if (screenSize >= 7.0 && screenSize <= 15.0) {
            this.screenSize = screenSize;
        } else {
            throw new IllegalArgumentException("Error: Screen size must be between 7.0 and 15.0 inches!");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Screen Size: %.2f inches\n", screenSize);
    }
}