//47.WAP TO CALCULATE SUM OF FACTORIAL OF ODD DIGIT IN A NUMBER.
package code;

public class Program47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =23456;
		int i =1;
		int fact =1;
		while(n>0)
		{
			int rem =n%10;
			{
				if(rem%2==0)
				{
				        while(rem>0)
						{
							fact =fact*rem;
							rem--;
						}
				        System.out.println("factorial::::"+fact);
					
				}
			}
			n=n/10;
			
			
		}

	}

}
