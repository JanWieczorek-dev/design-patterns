package com.wieczorek.jan.strategy.pattern;

public class Bird extends Animal{


    public Bird() {
        super();
        flyingType = new ItFlies();

    }
}
