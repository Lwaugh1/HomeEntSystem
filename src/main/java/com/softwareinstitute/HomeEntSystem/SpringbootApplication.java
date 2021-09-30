package com.softwareinstitute.HomeEntSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	public String myResponse(){
			Jukebox jukebox = new Jukebox();
			Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock", 355);
			Song Track2 = new Song("Heroes", "David Bowie", "Rock", 212);
			jukebox.addSong(Track1); jukebox.addSong(Track2);
			return jukebox.collection().toString();
	}
}
