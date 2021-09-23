package HomeEntSystem;

public class Song extends Entertainment {

    private String songTitle;
    private String artist;
    private String featuring;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song(String songTitle, String artist, String featuring, String genre, int duration, int releaseYear){
        this.songTitle = songTitle;
        this.artist = artist;
        this.featuring = featuring;
        this.genre = genre;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }
    public Song(String songTitle, String artist, String genre, int duration, int releaseYear){
        this(songTitle, artist, "null", genre, duration, releaseYear);

    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getFeaturing() {
        return featuring;
    }

    public void setFeaturing(String featuring) {
        this.featuring = featuring;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
