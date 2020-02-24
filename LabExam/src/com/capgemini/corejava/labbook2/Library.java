package com.capgemini.corejava.labbook2;
/*
import com.inheritence.Item;
import com.subclass1.Book;
import com.subclass2.JournalPaper;
import com.subclass5.CD;*/

public class Library {

	public static void main(String[] args) {
		
		Item j= new CD (2145255,"java",5,89,"Sid","grjjhk");
		j.addItem();
		j.checkIn();
		j.checkOut();
		j.equals();
		j.print();
		System.out.println(j);
	}
}
