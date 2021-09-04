package com.wieczorek.jan.decorator.pattern;

public class Sauce extends ToppingDecorator{

    public Sauce(Pizza pizzaBeingDecorated) {
        super(pizzaBeingDecorated);

        System.out.println("Adding dough");
        System.out.println("Adding sauce");

    }

    @Override
    public String getDescription() {
        return super.getDescription() + "sauce; ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
