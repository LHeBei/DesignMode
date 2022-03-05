package com.heior.controller;

import com.heior.service.Container;
import com.heior.service.Iterator;
import com.heior.service.Playable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author heior
 */
public class Library implements Container {
    List<Playable> dataList = new ArrayList<>();

    private Iterator iterator;

    @Override
    public Iterator getIterator() {
        if(iterator == null) {
            iterator = new PlayableIterator();
        } else {
            ((PlayableIterator) iterator).setIndex(0);
        }
        return iterator;

    }

    class PlayableIterator implements Iterator {
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < dataList.size();
        }

        @Override
        public Playable next() {
            if(hasNext()) {
                return dataList.get(index++);
            }
            return null;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    public void addPlayable(Playable playable){
        dataList.add(playable);
    }
}
