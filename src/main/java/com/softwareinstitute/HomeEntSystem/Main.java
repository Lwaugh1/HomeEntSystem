package com.softwareinstitute.HomeEntSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in).useDelimiter("\\n");

        Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 355);
        Song Track2 = new Song("Heroes", "David Bowie", "Rock", 212);
        Jukebox jukebox = new Jukebox();
        jukebox.addSong(Track1); jukebox.addSong(Track2);

        System.out.println("Welcome to Jukebox Entertainment System!");
        System.out.println("Choose from the following options:");
        System.out.println("[1] Choose Song from pre installed list");
        System.out.println("[2] Add Song to library");
        System.out.println("[9] Exit");
        int n = scan.nextInt();
        switch(n){
            case 1:
                for(Song s: jukebox.collection()){
                    System.out.print(s.getSongTitle()+ " -  ");
                    System.out.println(s.getArtist());
                };
                break;
            case 2:
                System.out.println("Song Title?");
                String songTitle = scan.next();

                System.out.println("Song Artist(s)?");
                String songArtist = scan.next();

                System.out.println("Genre of song");
                String songGenre = scan.next();

                System.out.println("How long is the song? (s)");
                int dur = scan.nextInt();

                System.out.println("Is there a Featuring artist on the song?");
                String songFeat = scan.next().toLowerCase();

                switch(songFeat) {
                    case "yes":
                        System.out.println("Featuring Artist(s)?");
                        String featArtist = scan.next();
                        jukebox.addSong(new Song(songTitle, songArtist, featArtist, songGenre, dur));
                        break;
                    case "no":
                        jukebox.addSong(new Song(songTitle, songArtist, songGenre, dur));
                        break;
                }
                break;
        }
    }
}
