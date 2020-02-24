package com.capgemini.corejava.labbook2;

public class CD extends MediaItem{
	
	private String artist;
	private String genre;
	
	
	public CD(long id, String title, int noOfCopies, int runtime, String artist, String genre) {
		super(id, title, noOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	
	

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + "]";
	}

	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void run() {
		System.out.println("CD is running");
	}
	@Override
	public void checkIn() {
		System.out.println("CD Checked-In");
		
	}

	@Override
	public void checkOut() {
		
		System.out.println("CD Checked-Out");
	}

	@Override
	public void addItem() {
		
		System.out.println("CD added");
		
	}
public void equals() {
		
		System.out.println("CD equals");
		
	}
}
