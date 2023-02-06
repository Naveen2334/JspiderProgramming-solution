//13.WAP TO CALCULATE SUM OF EVEN NO B/W 1 TO 10 WITH TRACING. 
package code;

public class Program13 {
   static int  sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1;i<10;i++)
		{
			if (i%2==0) {
				System.out.println("even no"+ i);
				 sum = sum + i;
				
			}
		}System.out.println(sum);

	}

}
