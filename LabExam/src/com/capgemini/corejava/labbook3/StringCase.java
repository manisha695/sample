package com.capgemini.corejava.labbook3;

import java.util.Scanner;

public class StringCase {



public static void main(String[] args) {
String s[]=new String[5];
String p[]=new String[5];
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of strings");
n=sc.nextInt();
System.out.println("enter strings");                                    
for(int i=0;i<n;i++)
{
s[i]=sc.next();
}
for(int i=0;i<n;i++)
for(int j=i+1;j<n;j++)
{
if(s[i].compareTo(s[j])>0)
{
String temp=s[i];
s[i]=s[j];
s[j]=temp;
}
}
if(n%2==0)
{
for(int i=0;i<n/2;i++)
{
s[i]=s[i].toUpperCase();
}
for(int i=n/2;i<n;i++)
{
s[i]=s[i].toLowerCase();
}
}
else if(n%2==1)
{
for(int i=0;i<n/2+1;i++)
{
s[i]=s[i].toUpperCase();
}
for(int i=n/2+1;i<n;i++)
{
s[i]=s[i].toLowerCase();
}
}
for(int i=0;i<n;i++)
{
System.out.println(s[i]);
}
}
}
