package com.heior.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author heior
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void attach(Observer observer) {
        this.observers.add(observer);
    }
    public int getState(){
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    private void notifyAllObserver() {
        for(Observer observer:observers) {
            observer.upadte(this);
        }
    }

}
