package com.demobench.model;

public class Customer {
    private int customerId;
    private Name name;
    private Contact contact;
    private Address address;


    public Customer() {
    }

    public Customer(int customerId, Name name, Contact contact, Address address) {
        this.customerId = customerId;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }



    // Getters and Setters
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name=" + name +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }
}
