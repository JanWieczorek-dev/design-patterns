package com.wieczorek.jan.decorator.pattern;

public class BasicPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Thin, crusty dough; ";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
