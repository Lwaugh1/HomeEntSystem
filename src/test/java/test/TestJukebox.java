package Test;
import com.softwareinstitute.HomeEntSystem.Jukebox;
import com.softwareinstitute.HomeEntSystem.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJukebox {
    Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 355);
    Song Track2 = new Song("Heroes", "David Bowie", "Rock", 212);
    Jukebox jukebox = new Jukebox();

    @Test
    public void testAddSong(){
        jukebox.addSong(Track1);
        assertEquals("Song Found" ,jukebox.getSong(Track1), "The songs are not the same");
    }
    @Test
    public void testDeleteSong(){
        jukebox.addSong(Track1);
        jukebox.addSong(Track2);
        jukebox.deleteSong(Track1);
        assertEquals("Song not Found", jukebox.getSong(Track1), "Song has not been deleted");
    }
    @Test
    public void testGetSong(){
        jukebox.addSong(Track1);
        assertEquals("Song Found", jukebox.getSong(Track1), "The song was not present in Jukebox");
    }
    @Test
    public void testPlaySong(){
        jukebox.addSong(Track1);
        jukebox.playSong(Track1);
        assertEquals("Playing " + Track1.getSongTitle(), jukebox.playSong(Track1), "the song did not play");
    }
}


