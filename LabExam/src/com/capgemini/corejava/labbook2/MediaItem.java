package com.capgemini.corejava.labbook2;

public abstract class MediaItem extends Item {
	
	private int runtime;
	

	public MediaItem(long id, String title, int noOfCopies, int runtime) {
		super(id, title, noOfCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	
	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + "]";
	}

	@Override
	public void checkIn() {
		System.out.println("Media Item Checked-In");
		
	}

	@Override
	public void checkOut() {
		
		System.out.println("Media Item Checked-Out");
	}

	@Override
	public void addItem() {
		
		System.out.println("Media Item added");
		
	}
public void equals() {
		
		System.out.println("Media Item equals");
		
	}
	public abstract void run();
	
	
	
}

