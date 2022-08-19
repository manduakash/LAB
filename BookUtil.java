/* @author Akash Singh
 * */
package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

public class BookUtil {
	public static void main(String[] args){							//main method
		BookStore obj = new BookStore();								//instantiating BookStore object
		Scanner s = new Scanner(System.in);								//instantiating scanner object
		
		
//		System.out.println("Enter how many books you want to add:");
//		int n = s.nextInt();

		for(int i=1; i<=3; i++) {										//running for loop three times to add 3 book instances
		//taking inputs from user 
		
		System.out.println("For book-"+i);
		System.out.println("Enter bookID:");
		String bookID = s.nextLine();									//taking input for bookID
		System.out.println("Enter title:");
		String title = s.nextLine();									//taking input for title
		System.out.println("Enter author:");
		String author = s.nextLine();									//taking input for author
		System.out.println("Enter category:");
		String category = s.nextLine();									//taking input for category
		System.out.println("Enter price:");
		float price = s.nextFloat();									//taking input for price
												
		
		obj.addBook(new Book(bookID,title,author,category,price));		//adding Book instances into BookStore
		System.out.println("\n"); 											
		}
	
		System.out.println("Enter title to search book: ");
		String title = s.nextLine();									//taking input for price
		obj.searchByTitle(title);										//searching book by book title 
		
		System.out.println("Enter author name to search book");
		String author = s.nextLine();									//taking input for price
		obj.searchByAuthor(author);										//searching book by author name
		
		obj.displayAll(); 												//displaying all books with details
		
		s.close(); 														//closing input stream
	}
	
}
