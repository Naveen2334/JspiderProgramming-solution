package code;
import java.util.Scanner;

	public class Program92 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of array");
			int n = sc.nextInt();
			System.out.println("enter the value in array");
			int arr[] = new int[n];
			int sum = 0;
			for(int i = 0;i<n;i++)
			{
				arr[i]= sc.nextInt();
			}

			for(int i =0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			for(int i = 0;i<arr.length;i++)
			{
				//if(i%2==0)//even index sum
					if(i%2==1) //odd index sum
					
				{
					 sum = sum +arr[i];
				}
			}System.out.println("sum at even index in array==="+sum);
		}
		

	}

