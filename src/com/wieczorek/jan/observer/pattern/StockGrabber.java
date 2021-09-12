package com.wieczorek.jan.observer.pattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(ArrayList<Observer> observers) {
        this.observers = observers;

    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void unregisterObserver(Observer observer) {
        int observerToDeleteIndex = this.observers.indexOf(observer);
        System.out.println("Observer " + (observerToDeleteIndex + 1) + " deleted");
        this.observers.remove(observerToDeleteIndex);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer : this.observers){
            observer.update(this.ibmPrice, this.applePrice, this.googlePrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }
}
