//40.WAP TO CALCULATE SUM OF ALL THE NOS WHICH IS PRESENT IN 20 TO 60 
//AND NO SHOULD BE DIVISIBLE BY ONLY 11.
package code;

public class Program40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0 ;
		
		for(int i = 20;i<60;i++)
		{
			if(i%11==0)
			{
				System.out.println("THE NOS WHICH IS PRESENT IN 20 TO 60 \r\n"
						+ "//AND NO SHOULD BE DIVISIBLE BY ONLY 11:::::" +i);
				sum = sum +i;
			}
			//System.out.println(sum);//Here loop will under goes repededly under goes 
		}
		System.out.println(sum);

	}

}
