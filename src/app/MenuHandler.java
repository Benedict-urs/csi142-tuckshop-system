package app;

import model.DrinkItem;
import model.FoodItem;
import model.Product;
import model.Sale;
import model.SaleItem;
import service.InputValidator;
import service.InventoryService;
import service.SalesService;
import java.util.Scanner;

public class MenuHandler {

    private InventoryService inventoryService;
    private SalesService salesService;
    private Scanner scanner;

    public MenuHandler() {
        inventoryService = new InventoryService();
        salesService = new SalesService();
        scanner = new Scanner(System.in);
        loadSeedData();
    }

    private void loadSeedData() {
        inventoryService.addProduct(new FoodItem("Bread", 150, 20));
        inventoryService.addProduct(new FoodItem("Biscuits", 50, 50));
        inventoryService.addProduct(new FoodItem("Mandazi", 200, 100));
        inventoryService.addProduct(new DrinkItem("Coca Cola", 13, 30));
        inventoryService.addProduct(new DrinkItem("Water", 5, 100));
        inventoryService.addProduct(new DrinkItem("Juice", 18, 40));
        inventoryService.addProduct(new DrinkItem("G-Vitah", 3, 400));
        inventoryService.addProduct(new DrinkItem("Energy drink", 13, 40));
        inventoryService.addProduct(new FoodItem("Fat cake", 2, 500));
        
    }

    public void start() {
        int choice = 0;
        while (choice != 6) {
            System.out.println("\n===== TUCKSHOP MANAGEMENT SYSTEM =====");
            System.out.println("1. Add a product");
            System.out.println("2. View all stock");
            System.out.println("3. Record a sale");
            System.out.println("4. Search product by name");
            System.out.println("5. Print sales report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                continue;
            }

            switch (choice) {
                case 1: addProduct(); break;
                case 2: inventoryService.viewStock(); break;
                case 3: recordSale(); break;
                case 4: searchProduct(); break;
                case 5: salesService.printReport(); break;
                case 6:
                    System.out.println("Thank you for using Tuckshop System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    private void addProduct() {
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

    private void recordSale() {
        System.out.print("Enter product name to sell: ");
        String name = scanner.nextLine().trim();
        Product product = inventoryService.searchByName(name);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }
        int qty = InputValidator.getPositiveInt(scanner, "Enter quantity to sell: ");
        if (qty > product.getQuantity()) {
            System.out.println("Not enough stock. Available: " + product.getQuantity());
            return;
        }
        product.setQuantity(product.getQuantity() - qty);
        Sale sale = new Sale();
        sale.addItem(new SaleItem(product, qty));
        salesService.recordSale(sale);
        System.out.println("Sale recorded! Total: BWP " + sale.getTotal());
    }

    private void searchProduct() {
        System.out.print("Enter product name to search: ");
        String name = scanner.nextLine().trim();
        Product product = inventoryService.searchByName(name);
        if (product != null) {
            System.out.println("Found: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }
}// Contributed by Baraka Mooketsi Nthcathe 
