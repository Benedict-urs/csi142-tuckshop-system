package model;

public class SaleItem {
    private Product product;
    private int quantitySold;

    public SaleItem(Product product, int quantitySold) {
        this.product = product;
        this.quantitySold = quantitySold;
    }

    public Product getProduct() { return product; }
    public int getQuantitySold() { return quantitySold; }

    public double getSubtotal() {
        return product.getPrice() * quantitySold;
    }

    public String toString() {
        return product.getName() + " x" + quantitySold + " = TZS " + getSubtotal();
    }
}