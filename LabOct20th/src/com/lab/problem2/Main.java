package com.lab.problem2;

public class Main {	//main class
	public static void main(String[] args) {	//main method
		//creating MovieTheater object
		MovieTheater m1 = new MovieTheater();	
		MovieTheater m2 = new MovieTheater();	
		
		//invoking add movie method
		m1.addMovie("Welcome", 21, 30, 24, 30, 250);
		m2.addMovie("Welcome Back", 16, 30, 18, 30, 300);
		
		//invoking movie details method
		m1.movieDetails();
		m2.movieDetails();
	}

}
