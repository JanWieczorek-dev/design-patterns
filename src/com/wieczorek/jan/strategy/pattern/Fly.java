package com.wieczorek.jan.strategy.pattern;

public interface Fly {

    public String fly();





}
//Probably should be in separate files in real code, to avoid using the default class access modifier
class ItFlies implements Fly {

    public String fly() {
        return "Flying";
    }

}

class DoesNotFly implements Fly {

    public String fly() {
        return "Can't fly";
    }
}