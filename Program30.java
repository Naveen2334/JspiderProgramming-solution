package code;

public class Program30 {
	static int i;
	static int rem;
	static int n;
	static int rev;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(n>10&&n<100)
		{
			rem = n%10;
			rev = rev *10+rem;
			n=n/10;
			
		}System.out.println(n);

	}
	{
		
	}

}
