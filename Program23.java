
package code;
import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y,t;
		System.out.println("enter the no you want to swap");
		 x = sc.nextInt();
		 y = sc.nextInt();
//		 t=x;
//		 x=y;
//		 y=t;
	// swap a no without using 	 
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("x"+x +"y"+y);

	}

}
