package com.wieczorek.jan.strategy.pattern;

public class StrategyTest {
    public static void main(String[] args) {
        Animal barky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Tweety " + tweety.tryToFly());
        System.out.println("Barky " + barky.tryToFly());

    }
}
