package com.wieczorek.jan.iterator.pattern;

public class SongInfo {

    String songName;
    String bandName;
    int yearOfRelease;

    public SongInfo(String songName, String bandName, int yearOfRelease) {
        this.songName = songName;
        this.bandName = bandName;
        this.yearOfRelease = yearOfRelease;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
