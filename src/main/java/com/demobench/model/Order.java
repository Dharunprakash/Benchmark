package com.demobench.model;



import java.util.ArrayList;
import java.util.List;


public class Order {
    private int orderId;
    private String orderDate;
    private Customer customer;
    private List<Item> items;
    private double totalAmount;
    private String status;

    public Order() {
    }
    public Order(int orderId, String orderDate, Customer customer, List<Item> items, double totalAmount, String status) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customer = customer;
        this.items = items;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Order(int orderId, String orderDate, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customer = customer;
        this.items = new ArrayList<>();
    }



    // Getters and Setters
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<Item> getItems() { return items; }
    public void setItems(List<Item> items) { this.items = items; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void addItem(Item item) {
        items.add(item);
    }

    public void calculateTotalAmount() {
        totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getPrice();
        }

    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                ", customer=" + customer +
                ", items=" + items +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }

}