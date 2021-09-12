package com.wieczorek.jan.observer.pattern;

public interface Subject {
    public void registerObserver(Observer O);
    public void unregisterObserver(Observer O);
    public void notifyObserver();
}
