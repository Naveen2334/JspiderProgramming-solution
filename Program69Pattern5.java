// c alphbet
package code;

public class Program69Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i= 0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
//C alphabet				//if(i==0||j==0||i==4)
//B alphabet				//if(i==0||j==0||j==4||i==2||i==4)
//D and O alphabet          //if((i==0||j==0||i==4||j==4)
//E alphabet                //if(i==0||j==0||i==2||i==4)
//F alphabet                //if(i==0||j==0||i==2)
//K alphabet     //if(i>=n/2||i<=3||i>=1)
				     //System.out.println(@);
				//if(j==n/2||i+j==n-1&&i<=n/2||i==j&&i>=n/2)	
//H alphabet                //if(i==n/2||j==0||j==4)
//I alphabet                //if(i==0||j==n/2||i==4)
//G alphabet               
				if(i==0||j==0||j<=n/2&&i==n-1||j==2&&i>=n/2||i==n/2&&j>=n/2||j==4&&i>=2)
				
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
