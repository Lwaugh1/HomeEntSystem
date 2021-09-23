package HomeEntSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){

        Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 355, 1975);
        Song Track2 = new Song("Heroes", "David Bowie", "Rock", 212, 1977);

        Jukebox jukebox = new Jukebox();

        jukebox.addSong(Track1);
        jukebox.addSong(Track2);

        System.out.println(jukebox.playSong(Track1));

    }



}
