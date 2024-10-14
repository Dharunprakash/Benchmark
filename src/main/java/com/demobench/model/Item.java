package com.demobench.model;


public class Item {
    private int productId;
    private String name;
    private int quantity;
    private double price;
    private Details details;


    public  Item() {
    }

    public Item(int productId, String name, int quantity, double price, Details details) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.details = details;
    }

    // Getters and Setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Details getDetails() { return details; }
    public void setDetails(Details details) { this.details = details; }

    @Override
    public String toString() {
        return "Item{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", details=" + details +
                '}';
    }
}
