package com.heior.service.impl;

import com.heior.domain.MediaType;
import com.heior.service.AdvancedMediaPlayer;
import com.heior.service.MediaPlayer;

/**
 * @author heior
 */
public class MediaAdapterImpl implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;


    public MediaAdapterImpl(String audioType){
        if(MediaType.VLC.getType().equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new VlcPlayerImpl();
        }else if(MediaType.MP4.getType().equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new Mp4PlayerImpl();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(MediaType.VLC.getType().equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playVlc(fileName);
        }else if(MediaType.MP4.getType().equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
