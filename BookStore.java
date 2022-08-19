/* @author Akash Singh
 * */

package com.book;

import java.util.ArrayList;

public class BookStore {	//main class
	ArrayList<Book> bookList = new ArrayList<>(); 	//creating arrayList object to store book objects
	
	//operation #1
	public void addBook(Book b) {					//passing book object as argument
		bookList.add(b);							//adding new book object to bookList Collection
	}
	
	//operation #2
	public void searchByTitle(String title) {		//passing title string as argument to search
		for (Book b : bookList) {
			if(title.contains(b.title)) {			//condition
				System.out.println(b); //if condition meets
				break;
			}else {
				System.out.println("not found");
				break;
			}
		}
	} 
	
	//operation #3
	public void searchByAuthor(String author) {		//passing author string as argument to search
		for (Book b : bookList) {
			if(author.contains(b.author)) {			//condition
				System.out.println(b); //if condition meets
				break;
			}else {
				System.out.println("not found");
				break;
			}
		}
	}
	
	//operation #4
	public void displayAll() {						//displayAll method with traverse and print all the elements of bookList collection
		//traversing
		for(Book b : bookList) {					//enhanced foreach loop
			System.out.println("bookID="+b.bookID+ " title="+b.title+" author="+b.author+" category="+b.category+ " price="+b.price+"\n");
		}
	}
}

