package com.pp.main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.pp.model.Book;
import com.pp.service.BookService;

public class Admin {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BookService bs=new BookService();
		char b;
		do {
			
			System.out.println("Enter 1 to view all books");
			System.out.println("Enter 2 to search book by title");
			System.out.println("Enter 3 to add a book");
			System.out.println("Enter 4 to delete a book");
			System.out.println("Enter 5 to update details of a book");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
					bs.viewAll();
					break;
					
			case 2:
					System.out.println("Enter the title of the book");
					String name=sc.next();
					Book rb=bs.viewByName(name);
					if(rb!=null) {
						System.out.println(rb);
					}else {
						System.out.println("There is no such book");
					}
					
					break;
			
			case 3:
					System.out.println("Enter the id of the book");
					int iid=sc.nextInt();
					System.out.println("Enter the title of the book");
					String iname=sc.next();
					System.out.println("Enter the author of the book");
					String iauthor=sc.next();
					System.out.println("Enter the price of the book");
					double price=sc.nextDouble();
					Book ib=new Book(iid,iname,iauthor,price);
					bs.insert(ib);
					break;
					
			case 4:
					System.out.println("Enter the id of the book you want to delete");
					int id1=sc.nextInt();
					bs.delete(id1);
					break;
					
			case 5:
					System.out.println("Enter the id");
					int idu=sc.nextInt();
					System.out.println("Enter the price");
					double p=sc.nextDouble();
					bs.update(idu, p);
					break;
			default:
				System.out.println("Invalid input.. ");
				System.exit(choice);
				return;
			
					
			}
		}while(true);
		
	}
	
}
