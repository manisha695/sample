package com.capgemini.corejava.labbook2;

public abstract class WrittenItem extends Item{
	
	private String author;

	public WrittenItem(long id, String title, int noOfCopies, String author) {
		super(id, title, noOfCopies);
		this.author = author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void checkIn() {
		System.out.println("Written Item Checked-In");
	}
	public void checkOut() {
		System.out.println("Written Item Checked-Out");
	}
	public void addItem() {
		System.out.println("Written Item added");
	}
	public void  equals() {
		System.out.println("Written Item equals");
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}

}