package com.wieczorek.jan.composite.pattern;

public abstract class SongComponent {

    public void addSongComponent(SongComponent newSongComponent){
        throw new UnsupportedOperationException();
    }

    public void removeSongComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }

    public String getSongName(){
        throw new UnsupportedOperationException();
    }

    public String getBandName(){
        throw new UnsupportedOperationException();
    }

    public String getReleaseYear(){
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo(){
        throw new UnsupportedOperationException();
    }
}
