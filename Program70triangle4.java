package code;

public class Program70triangle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9;
		for(int i = 0;i<9;i++)
		{
			for(int j = 0;j<9;j++)
			{
			//	if(i>=j&&i+j<n-1||i<=j&&i+j>n-1)
			//	if(i>=j&&i+j<n-1)
				
			//	if(i<=j&&i+j<n-1)
				if(i>=j&&i+j>n-1)
				
				
				{
					System.out.print("* ");//give one space after star
				}
				else
				{
					System.out.print("  ");//take no space within double quote
				}
				
			}
			System.out.println();
		}

	}

}