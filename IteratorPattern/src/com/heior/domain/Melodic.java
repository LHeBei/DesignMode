package com.heior.domain;

import com.heior.service.Playable;

/**
 * @author heior
 */
public class Melodic implements Playable {
    private String tittle;

    public Melodic(String tittle) {
        this.tittle = tittle;
    }
    /**
     * playing object
     */
    @Override
    public void playing() {
        System.out.println("Now is playing Melodic! " + tittle);
    }

    public String getTittle() {
        return tittle;
    }
}

