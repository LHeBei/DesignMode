package com.heior.domain;

import com.heior.service.DrawAPI;

/**
 * @author heior
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawApi) {
        this.drawAPI = drawApi;
    }
    public abstract void draw();

}
