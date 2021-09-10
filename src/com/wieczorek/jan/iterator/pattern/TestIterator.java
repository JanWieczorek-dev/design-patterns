package com.wieczorek.jan.iterator.pattern;

public class TestIterator {
    public static void main(String[] args) {

        SongsOfThe80s song80sToPlay = new SongsOfThe80s();
        SongsOfThe90s song90sToPlay = new SongsOfThe90s();

        DiscJockey ourDJ = new DiscJockey(song80sToPlay, song90sToPlay);

        ourDJ.showSongs();

    }
}
