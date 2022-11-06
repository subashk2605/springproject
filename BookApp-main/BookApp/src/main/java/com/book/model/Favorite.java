package com.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Favorite {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long fav;
	private Long userNo;
	private Long bookId;
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Favorite(Long userNo, Long bookId) {
		super();
		this.userNo = userNo;
		this.bookId = bookId;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	
	
}
