package code;

public class DictionaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"Manmohan","Sohan","Aman","Raja"};
		for(int i = 0;i<s.length;i++)
		{
			for(int j = 0;j<s.length-1;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp = s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i = 0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}

	}

}
