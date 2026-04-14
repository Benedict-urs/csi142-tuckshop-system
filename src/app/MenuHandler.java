package app;

import java.util.Scanner;

public class MenuHandler {

    private Scanner scanner;

    public MenuHandler() {
        scanner = new Scanner(System.in);
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
                case 1: System.out.println("Add product - coming soon"); break;
                case 2: System.out.println("View stock - coming soon"); break;
                case 3: System.out.println("Record sale - coming soon"); break;
                case 4: System.out.println("Search - coming soon"); break;
                case 5: System.out.println("Report - coming soon"); break;
                case 6: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice. Enter 1 to 6.");
            }
        }
    }
}