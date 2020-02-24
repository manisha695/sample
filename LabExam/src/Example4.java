import java.util.Scanner;

public class Example4 {
public static boolean checkNumber(int n) {
	if(n%2==0) {
		//System.out.println("true");
		return  true;
		
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(""+Example4.checkNumber(n));
	}

}
