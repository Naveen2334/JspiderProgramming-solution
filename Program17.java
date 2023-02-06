//17.WAP TO PRINT EACH DIGIT IN A NUMBER(IN REVERSE ORDER).->IN CLASS 
package code;
import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int i = 1;
		int rem = 0;
	     while(n>0)
		{
			rem=n%10;
			System.out.println(rem);
			n=n/10;
			
		}
		
		

	}

}
