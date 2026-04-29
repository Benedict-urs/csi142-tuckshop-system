package service;

import model.FoodItem;
import model.DrinkItem;
import service.InventoryService;
import service.InputValidator;
import java.util.Scanner;

public class ProductAdder {
    private final InventoryService inventoryService;
    private final Scanner scanner;

    public ProductAdder(InventoryService inventoryService, Scanner scanner) {
        this.inventoryService = inventoryService;
        this.scanner = scanner;
}

    public void addProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine().trim();

        double price = InputValidator.getPositiveDouble(scanner, "Enter price (BWP): ");
        int quantity = InputValidator.getPositiveInt(scanner, "Enter quantity: ");

        System.out.print("Is this Food or Drink? (f/d): ");
        String type = scanner.nextLine().trim().toLowerCase();

        if (type.equals("f")) {
            inventoryService.addProduct(new FoodItem(name, price, quantity));
        } else if (type.equals("d")) {
            inventoryService.addProduct(new DrinkItem(name, price, quantity));
        } else {
            System.out.println("Invalid type. Product not added.");
        }
    }
}


