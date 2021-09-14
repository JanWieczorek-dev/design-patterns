package com.wieczorek.jan.strategy.pattern;

public class Dog extends Animal{




    public Dog() {
        super();

       flyingType = new DoesNotFly();
    }
}
