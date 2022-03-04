package com.heior.service.impl;

import com.heior.service.AdvancedMediaPlayer;

/**
 * @author heior
 */
public class Mp4PlayerImpl implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);

    }
}
