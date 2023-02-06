//14.WAPT PRINT SUM OF ODD NO B/W 1 TO 10 WITH TRACING.

package code;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value upto which u want to know odd no");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		for(i=1;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd no :::"+i);
				sum +=i;
			}
		} System.out.println(sum);

	}

}
