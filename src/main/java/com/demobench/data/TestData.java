package com.demobench.data;



import com.demobench.model.*;

public class TestData {

    public static Order createTestOrder() {
        // Create customer details
        Name name = new Name("John", "Doe");
        Address address = new Address("123 Main St", "Springfield", "IL", "62701", "USA");
        Contact contact = new Contact("john@gmail.com", "217-555-1234");
        Customer customer = new Customer(1, name, contact, address);

        // Create item specifications
        Specifications specs = new Specifications();
        specs.setProcessor("Intel Core i7");
        specs.setRam("16GB");
        specs.setStorage("512GB SSD");

        // Create items and add details
        Item item1 = new Item();
        item1.setProductId(1);
        item1.setName("Laptop");
        item1.setQuantity(1);
        item1.setPrice(1500);
        item1.setDetails(new Details("TechBrand", specs));

        // Create order and add the item
        Order order = new Order(1, "2024-10-12", customer);
        order.addItem(item1);
        order.calculateTotalAmount();
        order.setStatus("Processing");

        return order;
    }
}
