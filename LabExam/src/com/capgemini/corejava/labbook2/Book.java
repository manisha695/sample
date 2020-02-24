package com.capgemini.corejava.labbook2;

public class Book extends WrittenItem{
	
	
	
	public Book(long id, String title, int noOfCopies, String author) {
		super(id, title, noOfCopies, author);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Book []";
	}



	public void checkIn() {
		System.out.println("Book Checked-In");
	}
	public void checkOut() {
		System.out.println("Book Checked-out");
	}
	public void addItem() {
		System.out.println("Book added");
	}
	public void equals() {
		System.out.println("Book equals");
	}
}
