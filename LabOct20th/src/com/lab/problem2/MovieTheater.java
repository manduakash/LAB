package com.lab.problem2;

public class MovieTheater {// logic class

	// data members
	private String movieName;
	private int movieStartTimeHr; // in 24 hours format
	private int movieStartTimeMint; // in 24 hours format
	private int movieEndTimeHr; // in 24 hours format
	private int movieEndTimeMint; // in 24 hours format
	private double movieTicketPrice;

	// for adding movie
	public void addMovie(String movieName, int movieStartTimeHr, int movieStartTimeMint, int movieEndTimeHr, int movieEndTimeMint, double movieTicketPrice) {
		this.movieName = movieName;
		this.movieStartTimeHr = movieStartTimeHr;
		this.movieStartTimeMint = movieStartTimeMint;
		this.movieEndTimeHr = movieEndTimeHr;
		this.movieEndTimeMint = movieEndTimeMint;
		this.movieTicketPrice = movieTicketPrice;
	}

	// for printing all details
	public void movieDetails() { // method for displaying movie ticket details
		System.out.println("\nMovie Name - " + this.movieName + "\nMovie Starting Time - " + movieStartTimeHr + ":"
				+ movieStartTimeMint + "\nMovie Ending Time - " + movieEndTimeHr + ":" + movieEndTimeMint
				+ "\nMovie Ticket Price - @" + movieTicketPrice + "/- Rs.");
	}
}
