package com.jpa.CompositePrimarykey.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.CompositePrimarykey.Entity.Song;
import com.jpa.CompositePrimarykey.Entity.SongEmbedded;
import com.jpa.CompositePrimarykey.Service.SongService;

@RestController
@RequestMapping("/song")
public class SongController {
	@Autowired
	SongService service;

	@PostMapping("/post")
	public void postSong(@RequestBody Song song) {
		service.createSong(song);
	}

	@GetMapping("/get")
	public Song getsongId(@RequestParam String name, @RequestParam String album , @RequestParam String artist) {
		return service.getsong(name, album,artist);
	}
			
	@RequestMapping("/getAll")
	public List<Song> getSong() {
		return service.get();

	}
}