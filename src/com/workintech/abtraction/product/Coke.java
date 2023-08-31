package com.workintech.abtraction.product;

public class Coke extends ProductForSale{
    private boolean hasSugar;
    public Coke(String type, double price, String description, boolean hasSugar) {
        super(type, price, description);
        this.hasSugar= hasSugar;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    @Override
    public void showDetails() {
        String result=  super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("has sugar: " + hasSugar + "\n");
        System.out.println(result+ builder.toString());

    }
}
