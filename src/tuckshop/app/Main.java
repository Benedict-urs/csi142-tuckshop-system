package tuckshop.app; 
 
import java.util.Scanner; 
 
public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int choice; 
 
        System.out.println("======================================"); 
        System.out.println("   TUCKSHOP MANAGEMENT SYSTEM v1.0    "); 
        System.out.println("======================================"); 
 
        do { 
            System.out.println("\n========== MAIN MENU =========="); 
            System.out.println("1. Add Product"); 
            System.out.println("2. Record Sale"); 
            System.out.println("3. View Stock"); 
            System.out.println("4. Search Product"); 
            System.out.println("5. Sales Report"); 
            System.out.println("6. Exit"); 
            System.out.print("Enter your choice (1-6): "); 
 
            choice = scanner.nextInt(); 
            scanner.nextLine(); 
 
            switch(choice) { 
                case 1: System.out.println("[STUB] Add Product - will implement later"); break; 
                case 2: System.out.println("[STUB] Record Sale - will implement later"); break; 
                case 3: System.out.println("[STUB] View Stock - will implement later"); break; 
                case 4: System.out.println("[STUB] Search Product - will implement later"); break; 
                case 5: System.out.println("[STUB] Sales Report - will implement later"); break; 
                case 6: System.out.println("Thank you for using Tuckshop System!"); break; 
                default: System.out.println("ERROR: Invalid choice!"); 
            } 
        } while(choice != 6); 
 
        scanner.close(); 
    } 
} 
