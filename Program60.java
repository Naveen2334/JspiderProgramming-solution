package code;
import java.util.Scanner;

public class Program60 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no until you want to find special no");
		int x = sc.nextInt();
		for(int i = 0;i<x;i++) {
		int n =i ;
		
		int sum = 0;
		int rem = 0;
		int product = 1;
		int temp =n ;
		
		while(n>0)
		{
			rem  = n%10;
			sum = sum +rem;
			product = product * rem;
			n=n/10;
		}
		
	    if(sum+product ==temp)
	    {
	    	System.out.println("above no is special no"+i);
	    }
	    
		
	}

}}
