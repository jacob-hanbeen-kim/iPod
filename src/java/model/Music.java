package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Music {

    private Artist artist;
    private String title;
    private String genre;
    private int length;

    public Music(Artist artist, String title, String genre, int length) {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.length = length;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
    }

    public void play() {
        try {
            FileReader fr = new FileReader(title + ".txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("Playing '" + title + "' by " + artist.getName());
            System.out.println();
            String lyrics;
            while ((lyrics = br.readLine()) != null) {
                System.out.println(lyrics);
            }

        } catch (IOException e) {
            System.out.println("Cannot play the music!");
        }

    }
}
