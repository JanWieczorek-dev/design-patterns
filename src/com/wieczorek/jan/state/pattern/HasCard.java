package com.wieczorek.jan.state.pattern;

public class HasCard implements AtmState{

    AtmMachine atmMachine;

    public HasCard(AtmMachine atmMachine){
        this.atmMachine = atmMachine;
    }




    @Override
    public void insertCard() {
        System.out.println("Card already inserted");

    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting card");
        atmMachine.setAtmState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234){
            System.out.println("Correct PIN");
            atmMachine.setAtmState(atmMachine.getHasCorrectPinState());
            atmMachine.correctPinEntered = true;
        }
        else{
            System.out.println("Incorrect PIN");
            System.out.println("Ejecting card");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int cashRequested) {
        System.out.println("Enter PIN first");
    }


}
