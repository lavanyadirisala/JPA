package com.jpa.mapping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Library {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int book_id;
	private String book_name;
	private String book_author;
	public Library() {
		super();
	}
	public Library(int book_id, String book_name, String book_author) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	
	
}
