package com.sj;


import java.util.Iterator;
import java.util.TreeSet;


public class DBBook {


	TreeSet<Book> tSet;
	
	public DBBook() {
		
		tSet = new TreeSet<Book>();
		
		Book book1 = new Book(1,"C","Mr.Yashwant",350);
		Book book2 = new Book(2,"Code","Robert",550);
		Book book3 = new Book(3,"Algorithm","Charles",750);
		Book book4 = new Book(4,"Python","Mark",450);
		
		tSet.add(book1);
		tSet.add(book2);
		tSet.add(book3);
		tSet.add(book4);
	}
	
	public void viewAll() {
		
		  Iterator<Book> itr = tSet.iterator();
		  
		  while(itr.hasNext()) {
			  
			  System.out.println(itr.next());
		  }
				
				
	}
	
	public Book viewByName(String name) {
		for(Book b : tSet) 
		  { 
			  if(b.title.equals(name)){ 
				 
				  return b;
				  
			  }
		}
		return null;
	}
	
	  public void insert(Book b2) {
			
			tSet.add(b2);
			 
			 System.out.println("Data Inserted..");
			  
		  }
		  
		  public boolean delete(int id1) {
			 Iterator<Book> itr = tSet.iterator();
			 
			  
				while(itr.hasNext()) {
					
					Book btemp = itr.next();
					
					if (btemp.bookId == id1) {
						
						itr.remove();
						System.out.println("Book Deleted !");
						
						return true;
						
						}
				}
					System.out.println("No book available !");	
					return false;
							
			}
				


		  public void update(int id2,double price1) {
			  
			  Iterator<Book> itr = tSet.iterator();
			  
				while(itr.hasNext()) {
					
					Book btemp = itr.next();
					
					if (btemp.bookId == id2) {
						
						String title1 = btemp.title;
						String author1 = btemp.author;
						
						itr.remove();
						
						 Book b=new Book(id2,title1,author1,price1);
						tSet.add(b);
						
						System.out.println("Details Updated");
				}
				
			}
			  
	  }

		
}
