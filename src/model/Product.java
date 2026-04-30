package model;

public abstract class Product {
    private String name;
    private double price;
    private int quantity;


    public Product(String name, double price) {
        this(name, price, 0);
    }


    public Product(String name) {
        this(name, 0.0, 0);
    }

    public Product(String name, double price, int quantity) {
        if (price <= 0) throw new IllegalArgumentException("Price must be greater than 0");
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public abstract String getCategory();

    public String toString() {
        return name + " | " + getCategory() + " | BWP " + price + " | Qty: " + quantity;
    }
}