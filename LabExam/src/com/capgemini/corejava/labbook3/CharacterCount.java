package com.capgemini.corejava.labbook3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
	
		public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		Map<Character, Integer> m=new HashMap();
		for(char c: s.toCharArray()) {
		if(m.containsKey(c)) {
		int n= (int)m.get(c)+1;
		m.put(c, n);
		}
		else {
		m.put(c, 1);
		}
		}
		for(Map.Entry k:m.entrySet())
		        {
		            System.out.println(k.getKey()+" "+k.getValue());
		        }
		}
		}



