package code;
import java.util.Scanner;

public class Program84_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		System.out.println("enter the value in array");
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Array at odd index");
		for(int i = 0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]);
			}
			sum = sum + arr[i];
		}
		System.out.println("sum == "+sum);
	}
}
