package code;
import java.util.Scanner;

public class Program88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		System.out.println("enter the value in array");
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}

		for(int i =1;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 1;i<arr.length;i++)
		{
			if(arr[i-1]<arr[i])
			{
				System.out.println(arr[i]);
			}
		}
	}
	

}
