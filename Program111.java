package code;

public class Program111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,8,7,3,3};
		for(int i = 0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j])
				{
					System.out.println("array value="+arr[j]+" "+"array index=="+j);
				}
				
			}
		}

	}

}
