//15.WAP TO PRINT SUM OF EVEN NO B/W 20 TO 10. 
package code;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int n = 20;
		int sum = 0;
		for(i = 20;i>10;i--)
		{
			if(i%2==0)
			{
				System.out.println("even no::::"+i);
			 sum = sum + i;
			}
		}System.out.println("sum::::"+sum);

	}

}
