package code;

public class Program49 {
	static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(4,5);
		checkoddeven();
		add(14,6);
		checkoddeven();

	}
	public static void add(int a,int b)
	{
		 sum = a+b;
		System.out.println(sum);
	}
	public static void checkoddeven()
	{
		if(sum%2==0)
		{
			System.out.println("This sum is even no");
		}
		else
		{
			System.out.println("This sum is odd no");
		}
	}

}
