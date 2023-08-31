package com.workintech.abtraction.product;

public class Chocolate extends ProductForSale {
    private boolean bitter;

    public Chocolate(String type, double price, String description, boolean bitter) {
        super(type, price, description);
        this.bitter= bitter;


    }

    public boolean isBitter() {
        return bitter;
    }

    @Override
    public void showDetails() {
        String result=  super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("bitter: " + bitter + "\n");
        System.out.println(result+ builder.toString());


    }

}
