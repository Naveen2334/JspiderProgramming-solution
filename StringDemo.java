package code;

public class StringDemo {
	int rollno;
	String name;
	StringDemo(int roll , String name)
	{
		this.rollno = roll;
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "StringDemo [rollno=" + rollno + ", name=" + name + "]";
	}



	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		StringDemo s = new StringDemo(101,"Manmohan");
		System.out.println(s);
		System.out.println(s.toString());
		

	}

}
