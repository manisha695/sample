package com.capgemini.corejava.labbook5;

import java.util.Scanner;

public class Fourth {
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		String firstName=sc.nextLine();
		String lastName=sc.nextLine();
		if(firstName.length()==0 || lastName.length()==0)
		{
			throw new MyException("name is blank");
			
			
		}
		}
		catch(MyException e) {
			System.out.println(e);
		}
		
	}
}
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}



