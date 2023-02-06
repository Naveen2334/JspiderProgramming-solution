//18.WAP TO PRINT EVEN DIGITS IN A NUMBER. 
package code;
import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt();
		int rem = 0;
		int evencount = 0;
		int oddcount = 0;
		int sum1 = 0 ;
		int sum2 = 0;
		while(n>0)
		{
		rem = n % 10;
		System.out.println(rem);
		if(rem%2==0)
		{
			evencount++;
			sum1 = sum1 + rem;
		}
		else
		{
			oddcount++;
			sum2=sum2+rem;
		}
		n=n/10;
		}System.out.println("no of even no:::::"+evencount);
		System.out.println("no of odd digit:::::"+oddcount);
		System.out.println(" sum of no in digit:::"+sum1);
		
		System.out.println("sum of no in odd digit::::"+sum2);
		

	}

}
