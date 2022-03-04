package com.heior.app;

import com.heior.service.impl.AudioPlayerImpl;

/**
 * @author heior
 */
public class App {
    private void run() {
        AudioPlayerImpl audioPlayer = new AudioPlayerImpl();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

    public App(){
        this.run();
    }
}
