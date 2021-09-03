package com.wieczorek.jan.state.pattern;

public class NoCash implements AtmState{


    AtmMachine atmMachine;

    public NoCash(AtmMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Insufficient cash in the machine");

    }

    @Override
    public void ejectCard() {
        System.out.println("Insufficient cash in the machine");

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Insufficient cash in the machine");

    }

    @Override
    public void requestCash(int cashRequested) {
        System.out.println("Insufficient cash in the machine");

    }
}
