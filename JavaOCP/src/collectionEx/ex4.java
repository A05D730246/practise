package collectionEx;

public class ex4 {

	public static void main(String[] args) 
	{
		student[] s=new student[3];
		s[0]=new student("a",45,74);
		s[1]=new student("b",78,65);
		s[2]=new student("c",65,65);
		//System.out.println(s[0]);
		
		for(student o:s)
		{
			o.show();
		}
		

	}

}
