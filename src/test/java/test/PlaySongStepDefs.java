package Test;

import com.softwareinstitute.HomeEntSystem.Jukebox;
import com.softwareinstitute.HomeEntSystem.Song;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlaySongStepDefs {

        private Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 355);
        private Song Track2 = new Song("Heroes", "David Bowie", "Rock", 212);
        private Jukebox jukebox = new Jukebox();

        @Given("song is available")
        public void songIsAvailable() {
            jukebox.addSong(Track1);
        }
        @When("song is played")
        public void songIsPlayed() {
            jukebox.playSong(Track1);
        }

        @Then("the song plays")
        public void theSongPlays(){
            jukebox.playSong(Track1);
            Assertions.assertEquals("Playing " + Track1.getSongTitle(), jukebox.playSong(Track1), "the song is not playing");
         }

        @Given("song is not available")
        public void songIsNotAvailable() {
            jukebox.deleteSong(Track1);
            Assertions.assertEquals("Song not Found", jukebox.getSong(Track1), "the song is available");
        }
        @When("song is searched")
        public void songIsSearched(){
            jukebox.getSong(Track2);
        }

        @Then("User can add song to jukebox")
        public void userCanAddSongToJukebox() {
            jukebox.addSong(Track2);
            Assertions.assertEquals("Song Found", jukebox.getSong(Track2), "the song has not been added");
        }
}