package com.company;

public class Bicycle implements CarbonFootprint{
    private String owner, brand;

    public Bicycle() {
    }

    public Bicycle(String owner, String brand) {
        this.owner = owner;
        this.brand = brand;
    }

    public Bicycle(Bicycle bicycle) {
        this.owner = bicycle.owner;
        this.brand = bicycle.brand;
    }

    @Override
    public double getCarbonFootprint() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "owner='" + owner + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
