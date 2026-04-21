# CSI142 Tuckshop Management System

## Group Members
- Baraka Mooketsi Nthcathe — 202500196
- Benedict John — 202507570
- Abel Khumo — 202502524
- Tlhompho Papiso — 202203256
- Thata Thebe — 202500220

## Project Title
Tuckshop Inventory and Sales Management System

## Domain
Business and Informal Trade

## Concept Note
Our project is a console-based Tuckshop Management System inspired by the small tuck shops found across Botswana's neighbourhoods, campuses, and rural communities. The system allows a tuckshop owner or attendant to manage product inventory, record sales, and generate a daily sales summary through a simple text menu. The domain model uses a Product abstract class with subclasses FoodItem and DrinkItem to demonstrate inheritance, abstraction, and polymorphism. A Sale class composes SaleItem objects to show composition, and an Inventory service manages all products using an ArrayList. The system handles five user actions: add a product, record a sale, view stock, search by name, and print a sales report. Invalid inputs such as negative quantities and non-numeric entries are handled cleanly. The project is organised into three packages: model, service, and app.

## Repository URL
https://github.com/Benedict-urs/csi142-tuckshop-system
## How to Compile and Run

1. Make sure Java JDK is installed
2. Open Terminal or Command Prompt
3. Navigate to the project folder
4. Run: javac -d out src/model/*.java src/service/*.java src/app/*.java
5. Run: java -cp out app.Main
6. Follow the menu options in the console

## Features
- Add food and drink products to inventory
- View all current stock
- Record a sale and reduce stock automatically
- Search for a product by name
- Print full sales report with grand total
- Invalid inputs handled cleanly without crashing
