ackage code;
import java.util.Scanner;

public class Program85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createArray(4);
		

	}
	public static int[] createArray(int size) {
		int i =1;
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[size];
		System.out.println("enter the value in array");
		for(i =0 ;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(arr[i]);
		
		return arr;
		
	}

}
