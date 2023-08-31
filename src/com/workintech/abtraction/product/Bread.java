package com.workintech.abtraction.product;

public class Bread extends  ProductForSale{
    private String color;
    public Bread(String type, double price, String description, String color) {
        super(type, price, description);
        this.color= color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void showDetails() {
        String result=  super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("color: " + color + "\n");
        System.out.println(result+ builder.toString());

    }
}
