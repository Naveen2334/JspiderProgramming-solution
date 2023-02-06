package code;
import java.util.Scanner;

public class Program50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorialOfNumber();

	}
	public static int factorialOfNumber()
	{
	Scanner  sc = new Scanner(System.in);
	System.out.println("enter the value of n");
	int n = sc.nextInt();
	
		int fact =1;
		int i = 1;
		
		
		for(i =1;i<=n;i++)
		{
			fact = fact*i;
			
		}System.out.println(fact);
		return fact;
	}

}
