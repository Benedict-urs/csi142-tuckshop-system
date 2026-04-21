package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("  Welcome to Tuckshop Management System");
        System.out.println("  Developed by Group - University of Botswana");
        System.out.println("===========================================");
        MenuHandler menu = new MenuHandler();
        menu.start();
    }
}