package HomeEntSystem;

import java.util.ArrayList;
import java.util.List;

public class Jukebox {
    private Song song;
    private List<Song> jukebox = new ArrayList<Song>();

    public void addSong(Song song) {
        jukebox.add(this.song);
    }
    public void deleteSong(Song song){
        jukebox.remove(this.song);
    }
    public String playSong(Song song){
        return "Playing " + song.getSongTitle();
    }
    public String PauseSong(Song song){
        return "Paused " + song.getSongTitle();
    }
    public String getSong(Song song){
        return song.getSongTitle();
    }
}
