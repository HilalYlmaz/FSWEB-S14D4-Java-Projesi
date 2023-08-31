package com.workintech.abtraction.product;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }
    public abstract void showDetails();

    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
       builder.append("type: " + type+ "\n");
        builder.append("price: " + price+ "\n");
        builder.append("description: " + description+ "\n");
        return builder.toString();
    }
}
