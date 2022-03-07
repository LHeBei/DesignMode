package com.heior.domain.impl;

import com.heior.domain.Observer;
import com.heior.domain.Subject;

public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    /**
     * 更新观察者
     *
     * @param subject 被观察者
     */
    @Override
    public void upadte(Subject subject) {
        System.out.println("binary " + Integer.toBinaryString(subject.getState()));
    }
}
