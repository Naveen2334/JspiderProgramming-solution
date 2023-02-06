//9.WAP TO PRINT ODD NO B/W 1 TO 10. 
package code;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 1;
		do {
			if(i%2==0) {
				System.out.println("even no:::"+i);
			}
			else
			{
				System.out.println("odd no"+i);
			}
			i++;
		}while(i<=10);

	}

}
