//10.WAP TO PRINT EVEN NO B/W 19 TO 9.

package code;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =19;
		while(i<=19&&i>9)//here if we don't take i=19  then code will not run because first condition is not satified
		{
			if(i%2==0)
			{
				System.out.println("even no ::::"+i);
			}
			i--;
		}

	}

}
