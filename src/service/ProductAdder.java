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
