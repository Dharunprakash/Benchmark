package com.demobench.model;



public class Details {
    private String brand;

    private Specifications specifications;

    public Details() {
    }

    public Details(String brand, Specifications specifications) {
        this.brand = brand;
        this.specifications = specifications;
    }

    // Getters and Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public Specifications getSpecifications() { return specifications; }
    public void setSpecifications(Specifications specifications) { this.specifications = specifications; }

    @Override
    public String toString() {
        return "Details{" +
                "brand='" + brand + '\'' +
                ", specifications=" + specifications +
                '}';
    }
}
