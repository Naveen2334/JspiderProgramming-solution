package code;

public class Program69triangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<5;i++)
		{
			for(int j = 0;j<5;j++)
			{
				if(i<=j)
				{
					System.out.print("* ");//give one space after star
				}
				else
				{
					System.out.print(" ");//take two space within double quote
				}
				
			}
			System.out.println();
		}

	}

}
