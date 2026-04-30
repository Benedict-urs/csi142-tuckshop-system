package service;
import model.Product;
import model.Sale;
import model.SaleItem;
import service.InventoryService;
import service.SalesService;
import service.InputValidator;
import java.util.Scanner;

public class SaleRecorder {
    private final InventoryService inventoryService;
    private final SalesService salesService;
    private final Scanner scanner;

    public SaleRecorder(InventoryService inventoryService, SalesService salesService, Scanner scanner) {
        this.inventoryService = inventoryService;
        this.salesService = salesService;
        this.scanner = scanner;
    }

    public void recordSale() {
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

        // Reduce stock
        product.setQuantity(product.getQuantity() - qty);

        // Create sale record
        Sale sale = new Sale();
        sale.addItem(new SaleItem(product, qty));
        salesService.recordSale(sale);

        System.out.printf("Sale recorded! Total: BWP %.2f%n", sale.getTotal());
    }
}