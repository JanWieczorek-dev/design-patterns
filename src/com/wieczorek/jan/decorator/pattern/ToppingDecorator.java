package com.wieczorek.jan.decorator.pattern;

public abstract class ToppingDecorator implements Pizza{

    final Pizza ourPizza;

    public ToppingDecorator(Pizza pizzaBeingDecorated){
        this.ourPizza = pizzaBeingDecorated;
    }


    @Override
    public String getDescription() {
        return ourPizza.getDescription();
    }

    @Override
    public double getCost() {
        return ourPizza.getCost();
    }
}
