package com.heior.domain.impl;

import com.heior.domain.Observer;
import com.heior.domain.Subject;

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
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
        System.out.println("OctObserver " + Integer.toOctalString(this.subject.getState()));
    }
}
