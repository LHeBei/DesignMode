package com.heior.service.impl;

import com.heior.service.AdvancedMediaPlayer;

/**
 * @author heior
 */
public class VlcPlayerImpl implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
