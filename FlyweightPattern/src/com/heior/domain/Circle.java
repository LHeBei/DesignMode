package com.heior.domain;

import com.heior.service.Shape;

public class Circle implements Shape {

    private String color;

    private Integer x;
    private Integer y;

    private Integer radius;
    public Circle(String color) {
        this.color = color;
    }
    /**
     * draw
     */
    @Override
    public void draw() {
        System.out.println(toString());
    }

    public Integer getRadius() {
        return radius;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle draw(): {" +
                "color='" + color + '\'' +
                ", X=" + x +
                ", Y=" + y +
                ", radius=" + radius +
                '}';
    }
}
