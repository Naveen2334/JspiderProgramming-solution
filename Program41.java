

//41.CHECK WHETHER THE NO IS PERFECT NO OR NOT.->IN CLASS 
package code;

import java.util.Scanner;

public class Program41 {
	public static void perfectno()
	{
		int n = 0;
		int sum = 0;
		int alpha = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		n = sc.nextInt();
		int  i = 1;
		while(n>0)
		{
			if(n%i==0)
			{
				System.out.println("factor are "+i);
				sum = sum + i;
				
			}
			i++;
		}System.out.println(sum);
		if(sum == alpha)
		{
		 System.out.println("no is perfect no");
		}
		else
		{
			System.out.println("no");
		}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		perfectno();	

	}

}
