package com.capgemini.corejava.labbook2;


public class Video extends MediaItem {
	
	private String director, genre ;
	private int yearReleased;
	
	
	
	public Video(long id, String title, int noOfCopies, int runtime, String director, String genre, int yearReleased) {
		super(id, title, noOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	



	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + "]";
	}




	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	public void run() {
		System.out.println("video is running");
	}
	@Override
	public void checkIn() {
		System.out.println("Video Checked-In");
		
	}

	@Override
	public void checkOut() {
		
		System.out.println("Video Checked-Out");
	}

	@Override
	public void equals() {
		
		System.out.println("Video equals");
		
	}
	
	
	
}