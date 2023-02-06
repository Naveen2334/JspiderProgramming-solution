//4.WAP TO DISPLAY MESSAGE GOOD MORNING WHEN NUMBER IS 8 AND NUMBER EQUALS TO 10 AND NUMBER EQUALS TO 11. 
package code;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the three no");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==8&&b==10&&c==11)
		{
			System.out.println("Good morning");
		}
		else 
		{
			System.out.println("no good morning");
		}
		

	}

}
