package com.jpa.CompositePrimarykey.Entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Song {
	@EmbeddedId private SongEmbedded id;
	private int duration;
    private String genre;
    private int rating;
	public Song() {
		super();
	}
	public Song(SongEmbedded id, int duration, String genre, int rating) {
		super();
		this.id = id;
		this.duration = duration;
		this.genre = genre;
		this.rating = rating;
	}
	public SongEmbedded getId() {
		return id;
	}
	public void setId(SongEmbedded id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
