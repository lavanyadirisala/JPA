package com.jpa.CompositePrimarykey.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.CompositePrimarykey.Entity.Song;
import com.jpa.CompositePrimarykey.Entity.SongEmbedded;
import com.jpa.CompositePrimarykey.Repository.SongRepository;

@Service
public class SongService {
	@Autowired
	SongRepository repo;

	public void createSong(Song song) {
		repo.save(song);

	}	
	public List<Song> get() {
		List<Song> list = repo.findAll();
		return list;
	}

	
	public Song getsong(String name, String album, String artist) {
		
		SongEmbedded id = new SongEmbedded(name, album, artist);
		return repo.findById(id).get();
	}
	 

}
