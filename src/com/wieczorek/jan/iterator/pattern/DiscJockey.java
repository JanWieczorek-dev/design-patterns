package com.wieczorek.jan.iterator.pattern;

import java.util.Iterator;

public class DiscJockey {

    SongIterator songs90sIter;
    SongIterator songs80sIter;

    public DiscJockey(SongIterator songs90s, SongIterator songs80s) {
        this.songs90sIter = songs90s;
        this.songs80sIter = songs80s;
    }

    public void showSongs(){
        Iterator songs90s = songs90sIter.createIterator();
        Iterator songs80s = songs90sIter.createIterator();

        System.out.println("Printing songs of the 80s");
        printTheSongs(songs80s);
        System.out.println("Printing songs sof the 90s");
        printTheSongs(songs90s);

    }

    public void printTheSongs(Iterator iterator){

        while(iterator.hasNext()){
            SongInfo songInfo = (SongInfo)iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearOfRelease());
        }


    }
}
