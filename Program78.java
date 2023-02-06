package code;
import java.util.Scanner;

public class Program78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n= sc.nextInt();
		System.out.println("enter the array");
		
		String[] arr = new String[n];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] =sc.nextLine();
			
		}
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		

	}

}
