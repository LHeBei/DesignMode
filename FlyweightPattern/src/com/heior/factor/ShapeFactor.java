package com.heior.factor;

import com.heior.domain.Circle;
import com.heior.service.Shape;

import java.util.HashMap;

/**
 * @author heior
 */
public class ShapeFactor {
    private static final HashMap<String, Circle> circleHashMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleHashMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleHashMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
