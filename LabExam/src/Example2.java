import java.util.Scanner;

public class Example2 {
	 static int sum=0,sum1=0,t;
	public static int calculateDifference(int n){
		for( int i=0;i<=n;i++)
		{
			sum=sum+i*i;
			for(int j=0;j<=n;j++)
			{
				sum1=sum1+j;
				int t=sum1*sum1;
			}
		}
		return sum-t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
 int n=s.nextInt();
 //int t=calculateDifference(int n)
 Example2.calculateDifference(n);
 System.out.println(""+(sum-t));
	}

}
