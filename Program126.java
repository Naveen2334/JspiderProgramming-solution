package code;

public class Program126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Manmohan Singh";
		char ch[]=s.toCharArray();
		int count = 0;
		for(int i = 0;i<ch.length;i++)
		{
			if(ch[i]!=' ')

				count++;
		}
		System.out.println(count);
	}

}
