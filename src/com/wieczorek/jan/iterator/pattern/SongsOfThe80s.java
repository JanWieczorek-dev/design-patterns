package com.wieczorek.jan.iterator.pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe80s  implements SongIterator{
    ArrayList<SongInfo> bestSongs = new ArrayList<>();

    public SongsOfThe80s() {
        addSong("title4", "band4", 1981);
        addSong("title5", "band5", 1985);
        addSong("title6", "band6", 1988);

    }

    public void addSong(String songName, String bandName, int releaseYear) {
        SongInfo newSong = new SongInfo(songName, bandName, releaseYear);
        bestSongs.add(newSong);

    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
