package com.onetoone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String firstname;
	
	private String lastname;
	
	private String langues;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLangues() {
		return langues;
	}

	public void setLangues(String langues) {
		this.langues = langues;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", langues=" + langues
				+ "]";
	}

	public Author(int id, String firstname, String lastname, String langues) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.langues = langues;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
