package model;

public class DrinkItem extends Product {

    public DrinkItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public DrinkItem(String name, double price) {
        super(name, price, 0);
    }

    public String getCategory() {
        return "Drink";
    }
}