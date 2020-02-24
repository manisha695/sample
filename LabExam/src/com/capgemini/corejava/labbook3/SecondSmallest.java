package com.capgemini.corejava.labbook3;

import java.util.Scanner;

public class SecondSmallest {
	
		public void getSecondSmallest(int a[]) {
			int i,j,temp;
			
			for(i=0;i<5;i++)
				for(j=0;j<4;j++)
					if(a[j]>a[j+1]) {
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
			System.out.print(a[1]);
		}
	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		SecondSmallest s=new SecondSmallest();
		System.out.println("second smallest number");
		s.getSecondSmallest(a);
			
	}

	}

