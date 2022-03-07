package com.heior.domain.impl;

import com.heior.domain.Observer;
import com.heior.domain.Subject;

/**
 * @author heior
 */
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
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
        System.out.println("hex " + Integer.toHexString(this.subject.getState()).toUpperCase());
    }
}
