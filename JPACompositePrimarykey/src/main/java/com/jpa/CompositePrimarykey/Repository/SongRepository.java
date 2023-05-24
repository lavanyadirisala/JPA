package com.jpa.CompositePrimarykey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.CompositePrimarykey.Entity.Song;
import com.jpa.CompositePrimarykey.Entity.SongEmbedded;

@Repository
public interface SongRepository extends JpaRepository<Song,SongEmbedded> {
	
}
