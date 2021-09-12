package com.wieczorek.jan.composite.pattern;

public class TestComposite {
    public static void main(String[] args) {

        SongComponent industrialMusic = new SongGroup("Industrial Music",
                "Blah, blah, blah");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal Music",
                "Yada, yada, yada");

        SongComponent industrialMusicSong = new Song("IndustrialMusicSong 1",
                "Workers' Alliance", 1964);
        industrialMusic.addSongComponent(industrialMusicSong);

        SongComponent industrialMusicSong2 = new Song("Spectral Music",
                "Communism", 1848);
        industrialMusic.addSongComponent(industrialMusicSong2);

        heavyMetalMusic.addSongComponent(new Song("War Pigs",
                "Black Sabath", 1970));

        heavyMetalMusic.addSongComponent(new Song("Ace of Spades",
                "Motorhead", 1980));

        SongComponent everySong = new SongGroup("Every Song ",
                "Every song available");

        everySong.addSongComponent(heavyMetalMusic);
        everySong.addSongComponent(industrialMusic);

        DiscJockey ourDiscJockey = new DiscJockey(everySong);

        ourDiscJockey.getSongList();

    }


}
