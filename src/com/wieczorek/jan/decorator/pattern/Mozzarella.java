package com.wieczorek.jan.decorator.pattern;

public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza pizzaBeingDecorated) {
        super(pizzaBeingDecorated);

        System.out.println("Adding Mozzarella");

    }
    @Override
    public String getDescription() {
        return ourPizza.getDescription() + "Mozzarella; ";
    }

    @Override
    public double getCost() {
        return ourPizza.getCost() + 1.0;
    }


}
