package com.pp.dao;

import java.util.TreeSet;

import com.pp.model.Book;

public class Database {
	
	
public TreeSet<Book> bookSet;
	
	public Database() {
		
		bookSet=new TreeSet<Book>();
		Book b1=new Book(1,"LetUsC","xyz",499.00);
		Book b2=new Book(2,"JavaEE","pqr",700.00);
		Book b3=new Book(3,"Java","abc",500.00);
		Book b4=new Book(4,"OS","cbi",750.00);
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		
	}

}
