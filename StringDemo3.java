package code;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Manmohan";
		char c = s.charAt(0);
		System.out.println(c);
		char d = s.charAt(1);
		System.out.println(d);
		String s1 = s.toUpperCase();
		System.out.println(s1);
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		String s3 = "   java is a Programming Language";
		System.out.println(s3);
		System.out.println(s3.trim());
		String s4 = s3.replace("\s", "");
		System.out.println(s4);
		//substring
		String s5 = s3.substring(5,12);
		System.out.println(s5);
		//to change string in character array
		String s6 = "java program";
		char ch[] =s6.toCharArray();
		for(int i = 0;i<ch.length;i++)
		{
		System.out.println(ch[i]);	
		}
		//to reverse string
		String s7 = "java program";
		String rev = "";
		char ch1[] =s7.toCharArray();
		
		for(int i = ch1.length-1;i>=0;i--)
		{
		
			rev=rev+ch1[i];
			System.out.println(ch1[i]);	
		}
		
		
		
	}

}
