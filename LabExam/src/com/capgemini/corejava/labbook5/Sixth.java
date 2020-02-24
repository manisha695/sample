package com.capgemini.corejava.labbook5;

import java.util.Scanner;

public class Sixth {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			float sal=sc.nextInt();
			if(sal<3000)
			{
				throw new EmployeeException("salary should be above 3000");
				
			}
			
		}
		catch(EmployeeException e) {
			System.out.println(e);
		}
	}

}
class EmployeeException extends Exception{
	EmployeeException(String msg){
		super(msg);
	}
}

