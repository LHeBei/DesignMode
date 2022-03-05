package com.heior.domain;

import com.heior.service.Playable;

/**
 * @author heior
 */
public class Podcast implements Playable {
    private String host;

    public Podcast(String host) {
        this.host = host;
    }
    /**
     * playing object
     */
    @Override
    public void playing() {
        System.out.println("noe playing Podcast! " + host);
    }

    public String getHost() {
        return host;
    }
}
