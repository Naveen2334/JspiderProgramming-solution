package code;

public class Program69pattern3 {

	public static void main(String[] args) {
		int n =5;
		// TODO Auto-generated method stub
		for(int i = 0;i<n ;i++)
		{                                            
			for(int j = 0;j<n;j++)
			{
				if(i==0||j==0||j==4||i==2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

} 
//*****
//*   *
//*****
//*   *
//*   *