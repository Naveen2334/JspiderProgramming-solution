package code;
import java.util.Scanner;

public class Program32 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the option you want to calculate ");
		String n = sc.nextLine();
		
			
		
		switch(n)
		{
		case "sqrt":
		{
			System.out.println("enter the value of base");
			int a = sc.nextInt();
			double k = Math.sqrt(a);
			System.out.println("the result:::"+k);
		}
		case "square":
		{
			System.out.println("enter the value of base");
			int a = sc.nextInt();
			double k = Math.pow(a, 2);
			System.out.println("the result:::"+k);
		}
		case "sin":
			System.out.println("enter the value of base");
			int a = sc.nextInt();
			double k = Math.sin(a);
			System.out.println("the result:::"+k);
		default:
			System.out.println("thank");
		
		
		}
		

	}

}
