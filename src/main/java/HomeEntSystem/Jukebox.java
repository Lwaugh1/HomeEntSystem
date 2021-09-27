package HomeEntSystem;

import java.util.ArrayList;
import java.util.List;

public class Jukebox {

    private List<Song> jukebox = new ArrayList<Song>();

    public void addSong(Song song) {
        jukebox.add(song);
    }
    public void deleteSong(Song song){
        jukebox.remove(song);
    }
    public String playSong(Song song){
        return "Playing " + song.getSongTitle();
    }
    public String pauseSong(Song song){
        return "Paused " + song.getSongTitle();
    }
    public String getSong(Song song){
        return song.getSongTitle();
    }
    public int quantity(){
        return jukebox.size();
    }
    public List<Song> collection(){
        return jukebox;
    }
}
