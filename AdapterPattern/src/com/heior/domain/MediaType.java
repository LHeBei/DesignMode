package com.heior.domain;

/**
 * @author heior
 */

public enum MediaType {
    VLC("vlc"),MP4("mp4"),MP3("mp3");
    private final String type;

    MediaType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
