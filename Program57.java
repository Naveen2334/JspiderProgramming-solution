package code;
import java.util.Scanner;

public class Program57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no you want to check");
		int n = sc.nextInt();
		int temp =n;
		int sum =0;
		while(n>0)
		{
			int r =n%10;
			 int fact =1;
			 while(r>0)
			 {
				 fact=fact*r;
				 r--;
			 }
			 sum =sum+fact;
			 n =n/10;
		}
		
		if(sum == temp)
		{
			System.out.println("strong no");
		}
		else
		{
			System.out.println("not strong");
		}
	}

}
