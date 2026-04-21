# OOP Mapping Document — Tuckshop Management System

| OOP Concept        | Where it appears                                    |
|--------------------|-----------------------------------------------------|
| Classes & Objects  | All 10 classes across model, service, app packages  |
| Encapsulation      | All fields are private in Product, Sale, SaleItem   |
| Abstract Class     | Product.java — cannot be instantiated directly      |
| Inheritance        | FoodItem extends Product, DrinkItem extends Product |
| Polymorphism       | InventoryService stores FoodItem and DrinkItem      |
|                    | as Product references and calls getCategory()       |
| Composition        | Sale has-a ArrayList of SaleItem objects            |
|                    | MenuHandler has-a InventoryService and SalesService |
| Constructor        | Product has one constructor with validation         |
| Overloading        | FoodItem and DrinkItem have 2 constructors each     |
| Collections        | ArrayList used in InventoryService, SalesService    |
|                    | and Sale to manage entities                         |
| Packages           | app — Main, MenuHandler                             |
|                    | model — Product, FoodItem, DrinkItem, Sale,         |
|                    |         SaleItem                                    |
|                    | service — InventoryService, SalesService,           |
|                    |           InputValidator                            |
| Robustness         | InputValidator handles invalid numbers              |
|                    | try-catch in MenuHandler for menu input             |
|                    | Stock check before recording a sale                 |
| Git Workflow       | GitHub repo with feature branch merged to main      |
|                    | Commits from all group members                      |