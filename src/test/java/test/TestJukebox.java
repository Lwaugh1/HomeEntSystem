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
        jukebox.deleteSong(Track1);
    }
}

