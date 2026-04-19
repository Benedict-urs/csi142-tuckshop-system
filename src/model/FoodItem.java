package model;

public class FoodItem extends Product {

    public FoodItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public FoodItem(String name, double price) {
        super(name, price, 0);
    }

    public String getCategory() {
        return "Food";
    }
}