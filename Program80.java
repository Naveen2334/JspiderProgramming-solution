package code;
import java.util.Scanner;

public class Program80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the size array");
		int n = sc.nextInt();
		System.out.println("enter the value in array");
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//System.out.println("array value at even index array");//if here we write then one time this will get printed  else inside loop it will print no of times the loop will run.

		for(int i = 0 ;i <arr.length;i++)
		{
			
			if(i%2==0)
			{
				//System.out.println("array value at even index array"+arr[i]);
				//System.out.println("array value at even index array");
				System.out.println(arr[i]);


			}
			else
			{
				//System.out.println("array value at odd index "+arr[i]);
			}
		}

	}

}
