package code;

public class Program74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k ='A';
		char k = 65;
		int n =5;
		for(int i=0;i<n;i++)
		{
			//int k =1;
			for(int j = 0;j<n;j++)
			{
				//int k =1;
				if(i>=j)
				{
					System.out.print(k++ + " ");
					//System.out.print(k++%2 + " ");
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
