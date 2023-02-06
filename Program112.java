package code;

public class Program112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,10,20,10,20};
		for(int i = 0;i<arr.length;i++)
		{
			int count = 0;
			int[] temp = new int[arr.length];
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					temp[j]= -1;
				}
			}
			if(temp[i]!=-1&&count==1)
			{
				System.out.println(arr[i]+" "+count);
			}
		}

	}

}
