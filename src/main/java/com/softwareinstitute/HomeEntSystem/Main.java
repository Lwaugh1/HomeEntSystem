package com.softwareinstitute.HomeEntSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 355);
        Song Track2 = new Song("Heroes", "David Bowie", "Rock", 212);
        Jukebox jukebox = new Jukebox();

        System.out.println(jukebox.playSong(Track1));
    }
}
