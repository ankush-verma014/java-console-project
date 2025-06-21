package com.ankush.library_management_system;

import java.util.Scanner;
import java.util.Vector;

public class Library 
{

	public void displayAvailableBooks(Vector<Book> book) 
	{
		System.out.println("Available Books in the Library :");
		
		for (Book books : book) 
		{
			System.out.println(books);
		}
	}
	
	public void issueBook(Vector<Book> book, Scanner sc)
	{
		System.out.println("Enter Book id which for Book issue :");
		Integer id = sc.nextInt();
		boolean flag = false;
		
		for (Book books : book) 
		{
			if(books.id()==id)
			{
				System.out.println("Issue : Book"+books);
				book.remove(books);
				flag = true;
				break;	
			}
		}
		if(!flag)
		{
			System.out.println("Book with ID 109 not found.");
		}
	}
	
	public void searchBook(Vector<Book> book , Scanner sc)
	{
		System.out.println("Enter keyword to search by title or author:");
		String search = sc.nextLine();
		search = sc.nextLine();
		boolean flag=false;
		for (Book books : book) 
		{
			if(search.contains(books.author()) || search.contains(books.title()))
			{
				System.out.println("Found:\n"+books);
				flag=true;
			}
			 
		}
		if(!flag)
		{
			System.out.println("No matching books found.");
		}
	}
}
