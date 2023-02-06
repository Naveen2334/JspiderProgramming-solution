package code;


import java.util.Scanner;

public class Program65 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value u want to check");
		int n = sc.nextInt();
		if(findSum(n)==n)
		{
			System.out.println("this is armstrong no");
		}
		else
		{
			System.out.println("this is not arms strong no");
		}

	}
	public static int findSum(int n)
	{
		int x =countDigit(n);
		int sum = 0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+findpower(rem,x);
			n=n/10;
		}return sum;
	}
	
	public static int findpower(int a,int b)
	{
		int pow = 1;
		for(int i =1;i<=b;i++)
		{
			pow=pow*a;
		}
		return pow;
	}
	public static int countDigit(int n)
	{
		int count = 0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return n;
		
	}
}
