package service;

import model.Product;
import java.util.ArrayList;

public class InventoryService {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void viewStock() {
        if (products.isEmpty()) {
            System.out.println("No products in stock.");
            return;
        }
        System.out.println("\n===== CURRENT STOCK =====");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public Product searchByName(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Product> getProducts() { return products; }
}