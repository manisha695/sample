package com.capgemini.corejava.labbook2;

//import com.inheritence.Item;
	public abstract class Item {

		private long Id;
		private String title;
		private int noOfCopies;
		
		public Item(long id, String title, int noOfCopies) {
			super();
			this.Id = id;
			this.title = title;
			this.noOfCopies = noOfCopies;
		}

		public String toString() {
			
			return "Item [Id=" + Id + ", title=" + title + ", noOfCopies="
					+ noOfCopies + "]";
		}
		
		public long getUniqueIdentificationNumber() {
			return Id;
		}
		public void setUniqueIdentificationNumber(long uniqueIdentificationNumber) {
			this.Id = uniqueIdentificationNumber;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getNoOfCopies() {
			return noOfCopies;
		}
		public void setNoOfCopies(int noOfCopies) {
			this.noOfCopies = noOfCopies;
		}
		public void print() {
			
			System.out.println("Id = "+Id+"\ntitle = "+title+"\nNo. of copies = "+noOfCopies);
			
		}
		public abstract void checkIn();
		public abstract void checkOut();
		public abstract void addItem();
		public abstract void equals();
	}


