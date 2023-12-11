/*
 * Assignment 2: Book Inventory
Design a class named Book to represent a book. Include attributes such as:
title (String)
author (String)
price (double)
Implement methods for calculating the discounted price and displaying book details. 
Create  Array Book objects and perform operations like finding the book with the highest price and displaying the average price.
 */

package com.java_part;

import java.util.Scanner;

class Book {
	String title;
	String author;
	double price;
	public Book()
	{
		
	}
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void discountedPrice(int discount)
	{
		System.out.println("Discounted price is:"+(price-(price*discount)/100));
	}
	void bookDetails()
	{
		System.out.println("Book Name: "+title+" Book author: "+author+" Book Price: "+price); 
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter number of Books: ");
		  int numOfBooks=sc.nextInt();
		  
		  Book[] books=new Book[numOfBooks];
		  
		  
		  System.out.println("Enter details of books");
		  for(int i=0;i<books.length;i++)  
		  {
			  System.out.print("Enter name of book: ");
			  String title=sc.next();
			  System.out.print("Enter author of book: ");
			  String author=sc.next();
			  System.out.print("Enter price of book: ");
			  double price=sc.nextDouble();
			  books[i]=new Book(title,author,price);
		  }
		  sc.close();
		  System.out.println();
		  
		  // Printing List of Books
		  System.out.println("List of books");
		  System.out.println();
		  for(int i=0;i<books.length;i++)
		  {
			  books[i].bookDetails();
			  System.out.println("---------------------------------------");
		  }
		  
		  // To find highest price book
		  System.out.println("Book with Highest price");
		  System.out.println();
		  Book obj=books[0];
		  for(int i=0;i<books.length-1;i++)
		  {
			  if(books[i].price<books[i+1].price)
				  obj=books[i+1];
				  
		  }
		  obj.bookDetails();
		  System.out.println();
		  
		  // To Calculate Average price of books
		  System.out.println("average of book price");
		  System.out.println();
		  double avg=0;
		  for(Book obj1:books)
		  {
			  avg=avg+obj1.price;
		  }
		  System.out.println(avg/books.length);
		  

	}
	
}
