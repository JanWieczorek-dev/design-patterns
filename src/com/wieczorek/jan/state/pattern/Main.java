package com.wieczorek.jan.state.pattern;

public class Main {

    public static void main(String[] args) {
        AtmMachine myATM = new AtmMachine();
        myATM.insertCard();
        myATM.ejectCard();
        myATM.insertCard();
        myATM.insertPin(1234);
        myATM.requestCash(2900);
        myATM.insertCard();
        myATM.insertPin(1234);
        myATM.requestCash(1900);
        myATM.insertCard();
        myATM.insertPin(1234);
        myATM.requestCash(100);
        myATM.insertCard();

    }
}
