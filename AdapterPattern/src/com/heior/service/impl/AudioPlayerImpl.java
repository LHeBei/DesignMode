package com.heior.service.impl;

import com.heior.domain.MediaType;
import com.heior.service.MediaPlayer;

/**
 * @author heior
 */
public class AudioPlayerImpl implements MediaPlayer {
    MediaAdapterImpl mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if(MediaType.MP3.getType().equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(MediaType.VLC.getType().equalsIgnoreCase(audioType)
                || MediaType.MP4.getType().equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapterImpl(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
