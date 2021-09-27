package Test;
import HomeEntSystem.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSong {
    Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 355, 1975);
    Song Track2 = new Song("Cold Heart", "Elton John", "Dua Lipa","Pop", 202, 2021);
    @Test
    public void testGetSongTitle(){
        Track1.getSongTitle();
        assertEquals("Bohemian Rhapsody" ,Track1.getSongTitle(), "The songs are not the same");
    }

    @Test
    public void testSetSongTitle(){
        Track1.setSongTitle("Back in Black");
        assertEquals("Back in Black", Track1.getSongTitle(), "The titles were not the same");
    }

    @Test
    public void testGetArtist(){
        Track1.getArtist();
        assertEquals("Queen", Track1.getArtist(), "The artists were not the same");
    }
    @Test
    public void testSetArtist(){
        Track1.setArtist("ACDC");
        assertEquals("ACDC", Track1.getArtist(), "The artists were not the same");
    }
    @Test
    public void testGetFeat(){
        Track2.getFeaturing();
        assertEquals("Dua Lipa", Track2.getFeaturing(), "The feat artists were not the same");
    }
    @Test
    public void testSetFeat(){
        Track2.setFeaturing("PNAU");
        assertEquals("PNAU", Track2.getFeaturing(), "The feat artists were not the same");
    }
    @Test
    public void testGetGenre(){
        Track1.getGenre();
        assertEquals("Rock", Track1.getGenre(), "The genres were not the same");
    }
    @Test
    public void testSetGenre(){
        Track2.setGenre("Dance");
        assertEquals("Dance", Track2.getGenre(), "The genres were not the same");
    }
    @Test
    public void testGetDuration(){
        Track1.getDuration();
        assertEquals(355, Track1.getDuration(), "The durations were not the same");
    }
    @Test
    public void testSetDuration(){
        Track2.setDuration(180);
        assertEquals(180, Track2.getDuration(), "The durations were not the same");
    }
}
