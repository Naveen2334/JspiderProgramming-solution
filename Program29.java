package code;

public class Program29 {
	static int n = 151;
	static int sum ;
	static int temp = n;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	while (n>0)
	{
		int rem = n %10;
		sum = (sum *10) + rem ;
		n = n/10;
		
		
	}
	System.out.println("sum:::"+sum);
	if(temp==sum)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not pallindrome");
	}
	}

}
