package com.nagarro.entity;

import java.sql.Date;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "LIB_SYSTEM")
public class Library {
@Id
	
	private int code;
	private String bname;
	private String author;
	private Date date;
	
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Library [code=" + code + ", bname=" + bname + ", author=" + author + ", date=" + date + "]";
	}

}
