package entity;

import java.util.Scanner;

public class Category {
    private int id;
    private String name;
    private boolean status;

    public Category() {
    }

    public Category(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Method to input category details
    public void inputCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter category ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter category name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter category status (true/false): ");
        this.status = scanner.nextBoolean();
    }

    // Method to display category details
    public void displayCategory() {
        System.out.println("Category ID: " + id);
        System.out.println("Category Name: " + name);
        System.out.println("Category Status: " + status);
    }
}
