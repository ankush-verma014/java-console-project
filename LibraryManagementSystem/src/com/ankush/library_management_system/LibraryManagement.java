package com.ankush.library_management_system;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Library l1 = new Library();
		
         Vector<Book> listOfBook = new Vector<>();
         listOfBook.add(new Book(101,"Core java","Mr James"));
         listOfBook.add(new Book(102,"Adv Java","Mr Robert"));
         listOfBook.add(new Book(103,"Head First Java","Miss Kathy Sierra"));
         listOfBook.add(new Book(104,"Programming in C","Mr Denis"));
         
         while(1==1) 
         {
         System.out.println("Select from the Menu :\r\n"
         		+ "	 1) Display Books Available in the Library :\r\n"
         		+ "	 2) Search a Book in the Library :\r\n"
         		+ "	 3) Issue a Book from the Library :\r\n"
         		+ "	 4) Exit from the application :");
         
         System.out.println("Please Enter your Choice :");
         int choice = sc.nextInt();
      
         switch (choice) 
         {
        
		case 1: 
		{
			
			
			l1.displayAvailableBooks(listOfBook);
			break;
		}
		case 2:
		{
		      l1.searchBook(listOfBook, sc);
		      break;
		}
		
		
		case 3:
		{
			l1.issueBook(listOfBook, sc);
			break;
		}
		case 4:
		{
			System.out.println("Thank you for Visiting..");
			System.exit(0);
		}
		
	  }  
         }

	}
}
