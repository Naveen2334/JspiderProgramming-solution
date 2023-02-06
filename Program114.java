package code;
import java.util.Scanner;

public class Program114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		System.out.println("array");
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("your entered value is");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"");
		}
		System.out.println();
		System.out.println("your output");
		for(int i = 0;i<arr.length/2;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
