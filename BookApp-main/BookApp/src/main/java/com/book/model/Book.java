package com.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String genera;
	private String authorname;
	public Book( String name, String genera, String authorname) {
		super();
		this.name = name;
		this.genera = genera;
		this.authorname = authorname;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenera() {
		return genera;
	}
	public void setGenera(String genera) {
		this.genera = genera;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", genera=" + genera + ", authorname=" + authorname + "]";
	}
	
}
