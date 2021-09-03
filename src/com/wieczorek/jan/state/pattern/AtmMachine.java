package com.wieczorek.jan.state.pattern;

public class AtmMachine {

    AtmState atmState;
    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    AtmState hasCard;
    AtmState noCard;
    AtmState hasCorrectPin;
    AtmState noCash;

    public AtmMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasCorrectPin(this);
        noCash = new NoCash(this);

        atmState = noCard;

        if (cashInMachine == 0){
            atmState = noCash;
        }
    }

    public void setAtmState(AtmState newAtmState){
        this.atmState = newAtmState;
    }
    public void setCashInMachine(int newCashAmount){
        this.cashInMachine = newCashAmount;
    }

    public AtmState getHasCardState(){ return hasCard; }
    public AtmState getNoCardState(){ return noCard; }
    public AtmState getHasCorrectPinState(){ return hasCorrectPin; }
    public AtmState getNoCashState(){ return noCash; }


    void insertCard(){
        atmState.insertCard();
    }

    void ejectCard(){
        atmState.ejectCard();
    }

    void insertPin(int pinEntered){
        atmState.insertPin(pinEntered);
    }
    void requestCash(int cashRequested){
        atmState.requestCash(cashRequested);
    }
}
