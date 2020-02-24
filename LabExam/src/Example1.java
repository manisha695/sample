import java.util.Scanner;
public class Example1 {
	static int sum=0;
	public static int calculateSum(int n)
	{
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example1 e=new Example1();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	     Example1.calculateSum(n);
		System.out.println("sum="+Example1.sum);
	}

}
