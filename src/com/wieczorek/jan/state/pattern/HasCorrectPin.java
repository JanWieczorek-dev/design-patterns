package com.wieczorek.jan.state.pattern;

public class HasCorrectPin implements AtmState{

    AtmMachine atmMachine;

    public HasCorrectPin(AtmMachine atmMachine){
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
        System.out.println("Pin already entered");

    }

    @Override
    public void requestCash(int cashRequested) {
        if (cashRequested < atmMachine.cashInMachine) {
            System.out.println("Dispensing requested amount");
            atmMachine.cashInMachine -= cashRequested;
            System.out.println("Ejecting card");
            atmMachine.setAtmState(atmMachine.getNoCardState());

        } else if (cashRequested == atmMachine.cashInMachine) {
            System.out.println("Dispensing requested amount");
            atmMachine.cashInMachine = 0;
            atmMachine.setAtmState(atmMachine.getNoCashState());
        } else {
            System.out.println("Insufficient cash in the machine");
            System.out.println("Ejecting card");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }

    }
}
