package com.capgemini.corejava.labbook3;
import java.util.Scanner;

import java.util.Arrays;


public class ReverseofNumber {


		public void getSorted(int a[]) {
			int i;
			for(i=0;i<a.length;i++) {
				int n=0,r=0,temp=0;
				 n=a[i];
				 while(n!=0) {
				 r=n%10;
				 temp=temp*10+r;
				 n/=10;
				
			 }
				 a[i]=temp;
				 temp=0;
			 }
			 System.out.println("Reverse of a array:");
			 for(i=0;i<a.length;i++)	 
			System.out.println(a[i]);
		
			System.out.println("Sorting the reversed Array:");
			for(i=0;i<a.length;i++) {
			Arrays.sort(a);
			System.out.println(a[i]);
			}
		}
			public static void main(String[] args) {
			
				int i;
				int a[]=new int[4];
				Scanner sc=new Scanner(System.in);
				for(i=0;i<a.length;i++)
					a[i]=sc.nextInt();
				ReverseofNumber rs=new ReverseofNumber();
				rs.getSorted(a);
				
				}
	}


