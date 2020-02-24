import java.util.Scanner;

public class Example3 {
public static boolean checkNumber(int n) {
	// boolean inc;
	 int p=9;
	 while(n>0) {
		int c=n%10;
		n=n/10;
		if(c>p) {
			 return false;
			//break;
			 
		}
		p=c;
		
		}
	 return true ;
	 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
if(Example3.checkNumber(n)) {
         System.out.println("increasing number");
         
	}
	else {
		 System.out.println("not an increasing number");}

}
}