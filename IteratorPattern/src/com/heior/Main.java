package com.heior;

import com.heior.controller.Library;
import com.heior.domain.Melodic;
import com.heior.domain.Podcast;
import com.heior.domain.Song;
import com.heior.service.Iterator;
import com.heior.service.Playable;

import java.util.List;

/**
 * @author heior
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Song song = new Song("travel light");
        Podcast podcast = new Podcast("999");
        Melodic melodic = new Melodic("moon light");
        library.addPlayable(song);
        library.addPlayable(podcast);
        library.addPlayable(melodic);
        Iterator iterator = library.getIterator();
        while (iterator.hasNext()) {
            Playable playable = iterator.next();
            playable.playing();
        }

        iterator = library.getIterator();
        while (iterator.hasNext()) {
            Playable playable = iterator.next();
            playable.playing();
        }

    }
}
