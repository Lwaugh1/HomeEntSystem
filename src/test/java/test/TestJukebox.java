package Test;
import HomeEntSystem.Jukebox;
import HomeEntSystem.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJukebox {
    Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 355, 1975);
    Song Track2 = new Song("Heroes", "David Bowie", "Rock", 212, 1977);
    Jukebox jukebox = new Jukebox();

    @Test
    public void testAddSong(){
        jukebox.addSong(Track1);
        assertEquals("Bohemian Rhapsody" ,jukebox.getSong(Track1), "The songs are not the same");
    }
    @Test
    public void testDeleteSong(){
        jukebox.addSong(Track1);
        jukebox.addSong(Track2);
        jukebox.deleteSong(Track1);
        assertEquals(1, jukebox.quantity(), "too many items in jukebox");
    }
    @Test
    public void testGetSong(){
        jukebox.getSong(Track1);
        assertEquals("Bohemian Rhapsody", jukebox.getSong(Track1), "The song titles were not the same");

    }
    @Test
    public void testQuantity() {
        jukebox.addSong(Track1);
        jukebox.addSong(Track2);
        assertEquals(2, jukebox.quantity(), "the jukebox not holding correct amount of songs");
    }
    @Test
    public void testPlaySong(){
        jukebox.playSong(Track1);
        assertEquals("Playing" + Track1.getSongTitle(), jukebox.playSong(Track1), "the song did not play");
    }
    @Test
    public void testPauseSong(){
        jukebox.pauseSong(Track1);
        assertEquals("Paused " + Track1.getSongTitle(), jukebox.pauseSong(Track1), "the song did not pause");
    }

}

