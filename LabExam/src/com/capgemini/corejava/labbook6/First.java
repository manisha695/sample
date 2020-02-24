package com.capgemini.corejava.labbook6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class First {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter String:");
String sc=s.nextLine();
int n=0,sum=0;
String temp=null;
StringTokenizer st=new StringTokenizer(sc);
while(st.hasMoreTokens()) {
temp=st.nextToken();
n=Integer.parseInt(temp);
sum+=n;
}
System.out.println(sum);
}

}


