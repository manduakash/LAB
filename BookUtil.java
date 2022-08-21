/* @author Akash Singh
 * */
package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

public class BookUtil {
	public static void main(String[] args){							//main method
		BookStore obj = new BookStore();								//instantiating BookStore object
		Scanner s  = new Scanner(System.in);								//instantiating scanner object
		
		
		
//		System.out.println("Enter how many books you want to add:");
//		int n = s.nextInt();

		for(int i=1; i<=3; i++) {										//running for loop three times to add 3 book instances
		//taking inputs from user 
		
		System.out.println("For book-"+i);
		System.out.println("Enter bookID:");
		Scanner scanBookID  = new Scanner(System.in);								//instantiating scanner object
		String bookID = scanBookID.nextLine();									//taking input for bookID
		
		System.out.println("Enter title:");
		Scanner scanTitle  = new Scanner(System.in);								//instantiating scanner object
		String title = scanTitle.nextLine();									//taking input for title
		
		System.out.println("Enter author:");
		Scanner scanAuthor  = new Scanner(System.in);								//instantiating scanner object
		String author = scanAuthor.nextLine();									//taking input for author
		
		System.out.println("Enter category:");
		Scanner scanCategory  = new Scanner(System.in);								//instantiating scanner object
		String category = scanCategory.nextLine();									//taking input for category
		
		System.out.println("Enter price:");
		Scanner scanPrice  = new Scanner(System.in);								//instantiating scanner object
		float price = scanPrice.nextFloat();									//taking input for price
												
		
		obj.addBook(new Book(bookID,title,author,category,price));		//adding Book instances into BookStore
		obj.displayAll(); 
		
		if(i!=4) {	//condition for close scanner input stream
			continue;
		}
		//closing all scanner input streams
		scanBookID.close();
		scanTitle.close();
		scanAuthor.close();
		scanCategory.close();
		scanPrice.close();
		}	//for loop end
	
		System.out.println("\nEnter title to search book: ");
		String title = s.nextLine();									//taking input for price
		System.out.println("\nSearched by title");
		obj.searchByTitle(title);										//searching book by book title 
		
		System.out.println("\nEnter author name to search book");
		String author = s.nextLine();									//taking input for price
		System.out.println("\nSearched by author");
		obj.searchByAuthor(author);										//searching book by author name
		
		System.out.println("\nPrinting all books:");
		obj.displayAll(); 												//displaying all books with details
		
		s.close(); 														//closing input stream
	}
	
}
