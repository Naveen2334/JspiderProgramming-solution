package code;

public class Program69pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		// TODO Auto-generated method stub
		for(int i = 0;i<n ;i++)
		{                                            
			for(int j = 0;j<n;j++)
			{
				if(i==j&&i<=n/2||i+j==n-1&&i<=n/2)
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


