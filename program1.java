/**
 Q1.wap to check whether the no is positive or not? 
 */
package code;
import java.util.Scanner;



public class program1 {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter the value u want to check");
		 int i = sc.nextInt();
		 int x;
		 do {
		if(i>0)
		{
			System.out.println("no is positive no");
		}
		//we have taken 1 as input to repeat this prosess it can only be possible by adding if loop in do while loop
		System.out.println("press 1 to continue alse stop");
		x = sc.nextInt();
		
		 }while(x==1);
		System.out.println("thank  you");

	}

}
