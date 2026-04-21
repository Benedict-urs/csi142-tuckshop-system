# Class Diagram — Tuckshop Management System

+--------------------------------------------------+
|                  <<abstract>>                    |
|                    Product                       |
|--------------------------------------------------|
| - name: String                                   |
| - price: double                                  |
| - quantity: int                                  |
|--------------------------------------------------|
| + getName(): String                              |
| + getPrice(): double                             |
| + getQuantity(): int                             |
| + setQuantity(int): void                         |
| + getCategory(): String  <<abstract>>            |
| + toString(): String                             |
+--------------------------------------------------+
              ^                    ^
              |                    |
   +----------+------+   +--------+--------+
   |   FoodItem      |   |   DrinkItem     |
   |-----------------|   |-----------------|
   | + getCategory() |   | + getCategory() |
   | returns "Food"  |   | returns "Drink" |
   +-----------------+   +-----------------+

+--------------------------------------------------+
|                   SaleItem                       |
|--------------------------------------------------|
| - product: Product                               |
| - quantitySold: int                              |
|--------------------------------------------------|
| + getProduct(): Product                          |
| + getQuantitySold(): int                         |
| + getSubtotal(): double                          |
| + toString(): String                             |
+--------------------------------------------------+
         HAS-A (composition)
              |
+--------------------------------------------------+
|                     Sale                         |
|--------------------------------------------------|
| - items: ArrayList<SaleItem>                     |
|--------------------------------------------------|
| + addItem(SaleItem): void                        |
| + getItems(): ArrayList                          |
| + getTotal(): double                             |
| + toString(): String                             |
+--------------------------------------------------+

+--------------------------------------------------+
|              InventoryService                    |
|--------------------------------------------------|
| - products: ArrayList<Product>                   |
|--------------------------------------------------|
| + addProduct(Product): void                      |
| + viewStock(): void                              |
| + searchByName(String): Product                  |
| + getProducts(): ArrayList                       |
+--------------------------------------------------+

+--------------------------------------------------+
|               SalesService                       |
|--------------------------------------------------|
| - sales: ArrayList<Sale>                         |
|--------------------------------------------------|
| + recordSale(Sale): void                         |
| + getTotalSales(): int                           |
| + getGrandTotal(): double                        |
| + printReport(): void                            |
+--------------------------------------------------+

+--------------------------------------------------+
|               InputValidator                     |
|--------------------------------------------------|
|--------------------------------------------------|
| + getPositiveInt(Scanner, String): int           |
| + getPositiveDouble(Scanner, String): double     |
+--------------------------------------------------+

+--------------------------------------------------+
|               MenuHandler                        |
|--------------------------------------------------|
| - inventoryService: InventoryService             |
| - salesService: SalesService                     |
| - scanner: Scanner                               |
|--------------------------------------------------|
| + start(): void                                  |
| - addProduct(): void                             |
| - recordSale(): void                             |
| - searchProduct(): void                          |
| - loadSeedData(): void                           |
+--------------------------------------------------+
         HAS-A (composition)
              |
+--------------------------------------------------+
|                   Main                           |
|--------------------------------------------------|
|--------------------------------------------------|
| + main(String[]): void                           |
+--------------------------------------------------+

PACKAGES:
- app     : Main, MenuHandler
- model   : Product, FoodItem, DrinkItem, Sale, SaleItem
- service : InventoryService, SalesService, InputValidator
