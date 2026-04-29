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


}
