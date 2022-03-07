package com.heior.domain;

/**
 * @author heior
 */
public abstract class Observer {
    protected Subject subject;

    /**
     * 更新观察者
     * @param subject 被观察者
     */
    public abstract void upadte(Subject subject);
}
