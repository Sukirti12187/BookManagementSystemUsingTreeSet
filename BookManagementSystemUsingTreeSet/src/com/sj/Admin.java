package com.sj;

import java.util.Scanner;


public class Admin {
	
	public static void main(String[] args) {
		
		char c;
		
		Scanner sc = new Scanner(System.in);
		DBBook db = new DBBook();
		
			
		System.out.println("Hello User..!!! \n");
		
		System.out.println("Welcome to menu:::\n");
		while(true) {
			System.out.println("1.View all books ");
			System.out.println("2.Search a book");
			System.out.println("3.Add a book");
			System.out.println("4.Delete a book");
			System.out.println("5.Update a book");
			
			System.out.println("Enter ur choice::");
			int choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				
				db.viewAll();
				
				break;
				
			case 2:
				
				System.out.println("Enter Book Title : ");
				String name = sc.next();
				
				
				Book b1 =  db.viewByName(name);
				
				if(b1!=null) {
					System.out.println(b1);
				}
				else {
					System.out.println("No Book Found..");
				}
				
				break;
				
			case 3:
				
				 System.out.println("Enter Book Id:");
				  int bid = sc.nextInt();
				  
				  System.out.println("Enter Book Title:");
				  String btitle = sc.next();
				 
				  System.out.println("Enter Book Author name:");
				  String bauthor = sc.next();
				 
				  System.out.println("Enter Book Price:");
				  int bprice = sc.nextInt();
				  
				  Book b2 = new Book(bid,btitle,bauthor,bprice);
				  db.insert(b2);
				
				  break;
			
			  case 4: 
				  
				  System.out.println("Enter Book Id to delete: ");
				  int id= sc.nextInt();
				  
				  db.delete(id);
				  
				  break;
			  
			  case 5:
				  
				  System.out.println("Enter Book Id to update: ");
				  int id2 = sc.nextInt();
				  
				  System.out.println("Enter Book Price:");
				  double price1 = sc.nextDouble();
				  
				  db.update(id2,price1);
				  
				  break;
			 
			default:
			
				System.out.println("Wrong Entry");
				
				break;
				
				}

			}
	}
}
	

	

