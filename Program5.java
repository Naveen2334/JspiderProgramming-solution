

//5.WRITE ONE PROGRAM FOR NESTED IF,else if Ladder->IN CLASS
package code;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		sc.next();
		char b = sc.next().charAt(0);
		if (age>23&&age<38)
		{
			
				if(a.equals("single") )
				{
					
					if(b=='A')
					{
						System.out.println("you are eligible for mairrage");
					}
				
					
			}
		}

	}

}
