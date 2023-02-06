package code;

public class Program127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java program";//"JAVA PROGRAM
		char ch[]=s.toCharArray();
		String upper = "";   
		for(int i = 0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				char c =(char)(ch[i]-32);//(ch[i]+32)
				upper =upper+c;
			}
		}
		System.out.println(upper);
		

	}

}
