//WAP TO PRINT GOODMORNING WHEN THE NO IS 8.

package code;
import java .util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no you want to print good morning");
		int n =sc.nextInt();
		if(n == 8)
		{
			System.out.println("Good morning");
		}
		else 
		{
			System.out.println("no good morning");
		}

	}

}
