package com.wieczorek.jan.visitor.pattern;

public class Alcohol implements Visitable{

    private double price;

    public Alcohol(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
