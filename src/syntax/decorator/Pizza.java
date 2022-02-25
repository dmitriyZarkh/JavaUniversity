package syntax.decorator;

public class Pizza implements Order{
    private String label;
    private double price;

    public Pizza(String label, double price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
