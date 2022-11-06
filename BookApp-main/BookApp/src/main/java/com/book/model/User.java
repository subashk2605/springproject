package com.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long no;
    private String name;
    private String ph;
    private String email;
    private String pass;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String ph, String email, String pass) {
		super();
		this.name = name;
		this.ph = ph;
		this.email = email;
		this.pass = pass;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", ph=" + ph + ", email=" + email + ", pass=" + pass + "]";
	}
	
}
