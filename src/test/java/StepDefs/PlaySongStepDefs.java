package StepDefs;

import com.softwareinstitute.HomeEntSystem.Jukebox;
import com.softwareinstitute.HomeEntSystem.Song;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlaySongStepDefs {
        Jukebox jukebox = new Jukebox();
        Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 355);
        Song Track2 = new Song("Heroes", "David Bowie", "Rock", 212);

        @Given("song is available")
        public void songIsAvailable(Song song){
            jukebox.addSong(song);
            assertEquals("yes", jukebox.getSong(song), "song is not available");
        }

        @Then("the song plays")
        public void theSongPlays(Song song) {
            assertEquals("Playing " + song.getSongTitle(), jukebox.playSong(song), "The song did not play");
        }

        @Given("song is not available")
        public void songIsNotAvailable(Song song){
            jukebox.deleteSong(song);
            assertEquals("no", jukebox.getSong(song), "the song is available");
        }

        @When("User can add song to jukebox")
        public void userCanAddSongToJukebox(Song song) {
            jukebox.addSong(song);
            assertEquals("yes", jukebox.getSong(song), "the song has not been added");
        }
}