package entity;

import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private double price;
    private String author;
    private int categoryId;
    private boolean status;

    public Book(int id, String name, double price, String author, int categoryId, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.categoryId = categoryId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    // Method to input book details
    public void inputBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter book name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter book price: ");
        this.price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter book author: ");
        this.author = scanner.nextLine();
        System.out.print("Enter category ID: ");
        this.categoryId = scanner.nextInt();
        System.out.print("Enter book status (true/false): ");
        this.status = scanner.nextBoolean();
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Book ID: " + id);
        System.out.println("Book Name: " + name);
        System.out.println("Book Price: $" + price);
        System.out.println("Book Author: " + author);
        System.out.println("Category ID: " + categoryId);
        System.out.println("Book Status: " + status);
    }

}
