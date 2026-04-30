package model;

import java.util.ArrayList;
import contracts.Reportable;

public class Sale implements Reportable {
    private ArrayList<SaleItem> items;

    public Sale() {
        items = new ArrayList<>();
    }

    public void addItem(SaleItem item) {
        items.add(item);
    }

    public ArrayList<SaleItem> getItems() { return items; }

    public double getTotal() {
        double total = 0;
        for (SaleItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public String toString() {
        String result = "";
        for (SaleItem item : items) {
            result += "  " + item.toString() + "\n";
        }
        result += "  Total: BWP " + getTotal();
        return result;
    }

    @Override
    public String generateReport() {
        return "Sale: " + items.size() + " items | Total: BWP " + getTotal();
    }
}