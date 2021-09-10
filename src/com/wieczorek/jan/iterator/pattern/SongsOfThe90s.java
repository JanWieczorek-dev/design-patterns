package com.wieczorek.jan.iterator.pattern;

import java.util.HashMap;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator{

    HashMap<Integer, SongInfo> bestSongs = new HashMap<Integer, SongInfo>();
    int hashMapKey = 0;

    public SongsOfThe90s(){
        addSong("title1", "band1", 1991);
        addSong("title2", "band2", 1995);
        addSong("title3", "band3", 1998);
    }


    public void addSong(String songName, String bandName, int releaseYear){
        SongInfo newSong = new SongInfo(songName, bandName, releaseYear);
        bestSongs.put(hashMapKey, newSong);
        hashMapKey++;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
