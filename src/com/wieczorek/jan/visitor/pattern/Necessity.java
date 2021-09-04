package com.wieczorek.jan.visitor.pattern;

public class Necessity implements Visitable{

    private double price;

    public Necessity(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
