//16.WAP TO PRINT SUM OF ODD NO B/W 35 TO 11.
package code;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i = 0;
      int sum = 0;
      for(i =35;i>11;i--)
      {
    	  if(i%2!=0)
    	  {
    	  System.out.println(i);
    	  sum = sum +i;
    	  }
      }System.out.println("sum:::::"+sum);
	}

}
