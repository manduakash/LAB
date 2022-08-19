/* @author Akash Singh
 * */

package com.book;

public class Book {	//main class
	String bookID, title, author, category;
	float price;
	
	public Book(String bookID, String title, String author, String category, float price)  {	//parameterized constructor
		//validations
		
		try {
			//conditon for bookID	
			if((bookID.charAt(0)=='B') && (bookID.length()==4)) {	//conditon
				this.bookID=bookID;		//if condition meet
			}
			else {
				throw new InvalidBookException("book id should be start with 'B' and lenght of 4");		//throws exception
			}
		
			
			//conditon for category	
			if((category.equalsIgnoreCase("Science")) || (category.equalsIgnoreCase("Fiction")) || (category.equalsIgnoreCase("Technology")) || (category.equalsIgnoreCase("Others"))) {	//conditon
				this.category=category;			//if condition meet
			}
			else {
				throw new InvalidBookException("category should be Science,Fiction and Others");		//throws exception
			}
			
			//conditon for price	
			if(price>0) {	//conditon
				this.price=price;		//if condition meet
			}
			else {
				throw new InvalidBookException("negative price can not be accepted");		//throws exception
			}
		this.title=title;
		this.author=author;
		}
		catch(Exception e) {	//exception handling
			System.out.println(e);
		}
	}
}

//creating custom exception class
class InvalidBookException extends Exception{	
	private static final long serialVersionUID = 1L;		//suggested by eclipse IDE

//exception class

	public InvalidBookException(String s) {	//parameterized constructor
		super(s);	//passing 's' argument to Exception super class
	}
}


