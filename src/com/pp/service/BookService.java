package com.pp.service;


import java.util.Iterator;


import com.pp.dao.Database;
import com.pp.model.Book;


public  class BookService  implements Comparable<Book>{
    
    Database db=new Database();
    
    public void viewAll() {
    	
    	Iterator<Book> itr=db.bookSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
    }
    
    public Book viewByName(String name) {
    	
    	for(Book booklist:db.bookSet) { 		
    		if(booklist.title.equals(name)) {
    			return booklist;
    		}
    	} return null;
    }
    
    public void insert(Book b1) {
		
		
		db.bookSet.add(b1);
		System.out.println("Book inserted");
		Iterator<Book> itr=db.bookSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
    
    public void delete(int bookId) {
		  boolean notFound=true;
		  Iterator<Book> itr=db.bookSet.iterator();
		  while(itr.hasNext()) {
			  	Book bTemp=itr.next();
			  	if(bTemp.bookId==bookId)
			  { 
			  		notFound=false;
			  		itr.remove();
			  		System.out.println("Book is deleted");
			  		break;
			  		
			  }
		  }	
			  	if(notFound) {
				  System.out.println("No book found");

			  	}
			  	
			  	Iterator<Book> itr1=db.bookSet.iterator();
				while(itr1.hasNext()) {
					System.out.println(itr1.next());
				}
				 			  
		  }
    
    public void update(int bookId,double price) {
		  boolean notFound=true;
	  Iterator<Book> itr=db.bookSet.iterator(); 
	  while(itr.hasNext()) 
	  {
		  notFound=false;
		  Book bTemp=itr.next();
	  
		  if(bTemp.bookId==bookId) 
		  { 
			  String title=bTemp.title; 
			  String author=bTemp.author; 
			  itr.remove(); 
			  Book b2 = new Book(bookId,title,author,price); 
			  db.bookSet.add(b2);
			  System.out.println("Details updated");
			  
		  }
	  }
	  if(notFound==true)  {
			  System.out.println("Wrong book id entered");
			  
		  }
	  Iterator<Book> itr1=db.bookSet.iterator(); 
	  while(itr1.hasNext()) {
	  System.out.println(itr1.next()); 
	  } 
	  
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	} 
	

}
