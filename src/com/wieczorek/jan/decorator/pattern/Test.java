package com.wieczorek.jan.decorator.pattern;

public class Test {

    public static void main(String[] args) {

        Pizza myDecoratedPizza = new Mozzarella(new Sauce(new BasicPizza()));

        System.out.println(myDecoratedPizza.getCost());
        System.out.println(myDecoratedPizza.getDescription());



    }
}
