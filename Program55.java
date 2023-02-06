package code;
import java.util.Scanner;

public class Program55 {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	static int fact =1;
	static void factorial() {
		int n = 10;
		for(int i = 1;i<n ;i++)
		{
		    fact = fact*i;
			System.out.println("factorial::::"+fact);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  factorial();

	}

}
