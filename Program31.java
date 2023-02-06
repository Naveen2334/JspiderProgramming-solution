package code;
import java.util.Scanner;

public class Program31 {


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of base");
		int a = sc.nextInt();
		System.out.println("enter the value of exxponent");
		int b = sc.nextInt();
		int pow =1;
		for(int i = 1;i<=b;i++)
		{
		 pow = pow * a;
		}
		System.out.println(pow);

	}

}
