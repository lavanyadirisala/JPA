package com.jpa.CompositePrimarykey.Entity;

import java.io.Serializable;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class SongEmbedded implements Serializable {
	private String name;
    private String album;
    private String artist;
	public SongEmbedded() {
		super();
	}
	public SongEmbedded(String name, String album, String artist) {
		super();
		this.name = name;
		this.album = album;
		this.artist = artist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
}
