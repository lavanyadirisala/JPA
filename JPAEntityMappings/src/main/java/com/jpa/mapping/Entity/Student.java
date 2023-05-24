package com.jpa.mapping.Entity;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_id;
	private String s_name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Library> book_required;

	public Student() {
		super();
	}

	public Student(int s_id, String s_name, List<Library> book_required) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.book_required = book_required;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public List<Library> getBook_required() {
		return book_required;
	}

	public void setBook_required(List<Library> book_required) {
		this.book_required = book_required;
	}

	
}
