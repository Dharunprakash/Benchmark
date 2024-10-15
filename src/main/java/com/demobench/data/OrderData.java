package com.demobench.data;

import com.demobench.model.*;

import java.util.ArrayList;

public class OrderData {

    public static Order createTestOrder1() {

        Name name = new Name("John", "Doe");
        Address address = new Address("123 Main St", "Springfield", "IL", "62701", "USA");
        Contact contact = new Contact("john@gmail.com", "217-555-1234");
        Customer customer = new Customer(1, name, contact, address);

        Specifications specs = new Specifications();
        specs.setProcessor("Intel Core i7");
        specs.setRam("16GB");
        specs.setStorage("512GB SSD");

        Item item1 = new Item();
        item1.setProductId(1);
        item1.setName("Laptop");
        item1.setQuantity(1);
        item1.setPrice(1500);
        item1.setDetails(new Details("TechBrand", specs));

        Order order = new Order(1, "2024-10-12", customer);
        order.addItem(item1);
        order.calculateTotalAmount();
        order.setStatus("Processing");

        return order;
    }

    public static Order createTestOrder2() {

        Name name = new Name("Jane", "Smith");
        Address address = new Address("456 Oak St", "Chicago", "IL", "60605", "USA");
        Contact contact = new Contact("jane.smith@example.com", "312-555-9876");
        Customer customer = new Customer(2, name, contact, address);

        Specifications specs = new Specifications();
        specs.setProcessor("AMD Ryzen 9");
        specs.setRam("32GB");
        specs.setStorage("1TB SSD");

        Item item1 = new Item();
        item1.setProductId(2);
        item1.setName("Gaming PC");
        item1.setQuantity(1);
        item1.setPrice(2500);
        item1.setDetails(new Details("GameMaster", specs));

        Order order = new Order(2, "2024-10-13", customer);
        order.addItem(item1);
        order.calculateTotalAmount();
        order.setStatus("Shipped");

        return order;
    }

    public static Order createTestOrder3() {

        Name name = new Name("Emily", "Johnson");
        Address address = new Address("789 Pine St", "Los Angeles", "CA", "90001", "USA");
        Contact contact = new Contact("emily.j@example.com", "323-555-4567");
        Customer customer = new Customer(3, name, contact, address);

        Specifications specs = new Specifications();
        specs.setProcessor("Apple M1");
        specs.setRam("8GB");
        specs.setStorage("256GB SSD");

        Item item1 = new Item();
        item1.setProductId(3);
        item1.setName("MacBook Air");
        item1.setQuantity(1);
        item1.setPrice(1200);
        item1.setDetails(new Details("Apple", specs));

        Order order = new Order(3, "2024-10-14", customer);
        order.addItem(item1);
        order.calculateTotalAmount();
        order.setStatus("Delivered");

        return order;
    }

    public static Order[] createTestOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(createTestOrder1());
        orders.add(createTestOrder2());
        orders.add(createTestOrder3());

        return  orders.toArray(new Order[0]);


    }
}
