//63.WAP TO PRINT PRIME NUMBER B/W 1 TO 50.
//not complete do it again
package code;
import java.util.Scanner;

public class Program63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
        int n = sc.nextInt();
		for(int i = 0;i<n/2;i++)
		{
			while(n>0)
			{
				if(n%1==1&&n%n==1)
				{
					System.out.println(n);
				}
			}
		}

	}

}
