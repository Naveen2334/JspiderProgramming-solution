package code;
import java.util.Scanner;

public class Program97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		
		int temp[];
		
		
			System.out.println("enter the array");
			for(int i = 0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
				
			}
			System.out.println("array will be");
			for(int i = 0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
				//System.out.println();
				
			}
			System.out.println();
			System.out.println("copy array in new array");
			temp= arr;
		
			for(int i=0;i<arr.length;i++) {
			System.out.println(temp[i]);
			}
		
		
		

	}

}
