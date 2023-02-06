package code;
import java.util.Scanner;

public class Program76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("array will be");
		for(int i = 0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i]);
		}

	}

}
