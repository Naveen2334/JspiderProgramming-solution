package code;

public class Program71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		for(int i = 0;i<n;i++)
		{
			
			for(int j = 0;j<n;j++)
			{
				
				//if(i+j<=1||i+j>=7||i-j>=3||j-i>=3)
					if(!(i+j<=1||i+j>=7||i-j>=3||j-i>=3))
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
