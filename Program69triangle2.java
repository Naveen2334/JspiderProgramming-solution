package code;

public class Program69triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0 ; i<5;i++)
		{
			for(int j =0;j<5;j++)
			{
//				if(i>j)
//					*    
//					**   
//					***  
//					****
//				if(i<j)
//					****
//					  ***
//					   **
//					    *
//				if(i+j<5-1)
//					**** 
//					***  
//					**   
//					*
				if(i+j>5-1)
//					    *
//					   **
//					  ***
//					 ****
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
			

	}

}
