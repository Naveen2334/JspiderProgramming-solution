package code;
import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int rem ;
		int j = 0;
		while(n>0)
		{
			rem = n%10;
			System.out.println(rem);
			n =n/10;
		    if(rem%2==0)
		    {
		    	 j = (int) Math.pow(rem, 2);   //doupt : we get only one output square if we want to square all the digt at even postion then what i have to do?
		    	
		    }
			
		}System.out.println(j);

	}

}
