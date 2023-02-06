package code;
import java.util.Scanner;

	public class Program94 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of array");
			int n = sc.nextInt();
			System.out.println("enter the value in array");
			int arr[] = new int[n];
			int sum = 0;
			int i = 0;
			int max = arr[0];
			for(i = 0;i<n;i++)
			{
				arr[i]= sc.nextInt();
			}

			for(i =0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			for( i = 0;i<n;i++)
			{
				if(i%2==0)//even index sum
					//if(i%2==1) //odd index sum
				{
					if(arr[i]>max)
					{
						max=arr[i];
					}
				}
				
			}
			System.out.println("max at even index in array==="+max);
		}
		

	}

