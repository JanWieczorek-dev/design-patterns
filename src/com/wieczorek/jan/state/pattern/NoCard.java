package com.wieczorek.jan.state.pattern;

public class NoCard implements AtmState{

    AtmMachine atmMachine;

    public NoCard(AtmMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted");
        atmMachine.setAtmState(atmMachine.getHasCardState());


    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject");

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Insert a card first");

    }

    @Override
    public void requestCash(int cashRequested) {
        System.out.println("Insert a card first");

    }
}
