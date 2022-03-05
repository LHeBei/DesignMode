package com.heior.domain;

import com.heior.service.Playable;

public class Song implements Playable {
    private String name;

    public Song(String name) {
        this.name = name;
    }

    /**
     * playing object
     */
    @Override
    public void playing() {
        System.out.println("now playing song! " + name);
    }

    public String getName() {
        return name;
    }
}
