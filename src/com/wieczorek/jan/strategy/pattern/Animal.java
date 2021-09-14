package com.wieczorek.jan.strategy.pattern;

public class Animal {

    Fly flyingType;


    public Animal() {

    }

    public Animal(Fly flyingType) {
        this.flyingType = flyingType;
    }

    public void setFlyingType(ItFlies flyingType){
        this.flyingType = flyingType;
    }

    public String tryToFly (){
        return flyingType.fly();
    }

}
