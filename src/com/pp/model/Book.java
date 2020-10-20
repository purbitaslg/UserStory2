package com.pp.model;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Comparable<Book> {
	
	public int bookId;
    public String title;
	public String author;
	Double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String title, String author, Double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}



	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		return this.bookId-arg0.bookId;
	}
	
	
	
	
	

}
