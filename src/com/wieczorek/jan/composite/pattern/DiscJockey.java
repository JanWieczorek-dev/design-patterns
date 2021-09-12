package com.wieczorek.jan.composite.pattern;

public class DiscJockey {

    SongComponent songList;

    public DiscJockey(SongComponent songList) {
        this.songList = songList;
    }

    public void getSongList(){
        this.songList.displaySongInfo();
    }
}
