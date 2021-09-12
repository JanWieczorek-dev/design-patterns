package com.wieczorek.jan.observer.pattern;

public class StockObserver implements Observer{

    private double appplePrice;
    private double ibmPrice;
    private double googlePrice;

    private static int observrIdTracker = 0;

    private int observerID;

    private Subject stockGrabber;


    @Override
    public void update(double applesPrice, double ibmPrice, double googlePrice) {
        this.googlePrice = googlePrice;
        this.appplePrice = applesPrice;
        this.ibmPrice  = ibmPrice;
        printThePrices();

    }

    public StockObserver(int observerID, Subject stockGrabber) {
        this.observerID = ++ observerID;
        this.stockGrabber = stockGrabber;
        System.out.println("New observer: " + this.observerID);
        stockGrabber.registerObserver(this);
    }

    public void printThePrices(){
        System.out.println(observerID);
        System.out.println("Apple price: " + this.appplePrice);
        System.out.println("Google price: " + this.googlePrice);
        System.out.println("IBM price: " + this.ibmPrice);

    }
}
