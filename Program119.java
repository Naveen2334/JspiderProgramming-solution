package code;
//import java.util.Scanner;

public class Program119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size of array");
//		int n = sc.nextInt();
		System.out.println("enter the value of array");
		int arr [] = {3,6,7,9,5,11};
		for(int i = 0;i<arr.length;i++)
		{
			int count  = 0;
			int j =2;
			for(;j<arr[i]/2;)
			{
				
			
			if(arr[i]%j==0)
			{
				count++;
			}
			j++;
		}
			if(count==0)
			{
				System.out.println(arr[i]);
			}

	}

}
}
