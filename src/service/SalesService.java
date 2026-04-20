package service;

import model.Sale;
import model.SaleItem;
import java.util.ArrayList;

public class SalesService {
    private ArrayList<Sale> sales = new ArrayList<>();

    public void recordSale(Sale sale) {
        sales.add(sale);
    }

    public int getTotalSales() {
        return sales.size();
    }

    public double getGrandTotal() {
        double total = 0;
        for (Sale sale : sales) {
            total += sale.getTotal();
        }
        return total;
    }

    public void printReport() {
        if (sales.isEmpty()) {
            System.out.println("No sales recorded yet.");
            return;
        }
        System.out.println("\n===== SALES REPORT =====");
        int saleNumber = 1;
        for (Sale sale : sales) {
            System.out.println("Sale #" + saleNumber + ":");
            for (SaleItem item : sale.getItems()) {
                System.out.println("  " + item);
            }
            System.out.println("  Sale Total: BWP " + sale.getTotal());
            saleNumber++;
        }
        System.out.println("========================");
        System.out.println("Total Sales Made: " + getTotalSales());
        System.out.println("GRAND TOTAL: BWP " + getGrandTotal());
    }
}