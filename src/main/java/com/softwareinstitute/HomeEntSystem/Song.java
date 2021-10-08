package com.softwareinstitute.HomeEntSystem;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Song {

    private String songTitle;
    private String artist;
    private String featuring;
    private String genre;
    private int duration;

    public Song(String songTitle,
                String artist,
                String featuring,
                String genre,
                int duration) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.featuring = featuring;
        this.genre = genre;
        this.duration = duration;
    }
    public Song(String songTitle, String artist, String genre, int duration) {
        this(songTitle, artist, "null", genre, duration);
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getFeaturing() {
        return featuring;
    }

    public void setFeaturing(String featuring) {
        this.featuring = featuring;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "{" +
                "\"Title\": \"" + songTitle +
                "\", \"Artist\":\"" +  artist +
                "\", \"Feat\":\"" + featuring +
                "\", \"Genre\":\"" +  genre +
                "\", \"Duration\":\"" + duration +
                "\"}";
    }
}

