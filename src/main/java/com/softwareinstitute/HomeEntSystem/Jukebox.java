package com.softwareinstitute.HomeEntSystem;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Jukebox {
    private Jukebox jukebox;
    private List<Song> collection = new ArrayList<Song>();

    public void addSong(Song song) {
        this.collection.add(song);
    }
    public void deleteSong(Song song){
        this.collection.remove(song);
    }
    public String playSong(Song song){
        if(this.collection.contains(song)){
            return "Playing " + song.getSongTitle();
        }
        else{
            return "Song not Found";
        }
    }
    public String pauseSong(Song song) {
        if (this.jukebox.playSong(song) == "Playing " + song.getSongTitle()) {
            return "Paused " + song.getSongTitle();
        }
        else {
            return "Song not Playing";
        }
    }

    public String getSong(Song song){
        if(this.collection.contains(song)){
            return "Song Found";
        }
        else{
            return "Song not Found";
        }
    }

    public List<Song> collection() {
        return this.collection;
    }

        public Optional<Song> selectSongsByTitle(String songTitle){
            return this.collection.stream().filter(song -> song.getSongTitle().equals(songTitle)).findFirst();
    }
    public String toString(){
        String json = new Gson().toJson(collection);
        return json;
    }
}