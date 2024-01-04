package collectionEx;

import java.util.ArrayList;

public class ex5 {

	public static void main(String[] args) 
	{
		ArrayList<student> x=new ArrayList();
		x.add(new student("a",66,80) );
		x.add(new student("b",77,95) );
		x.add(new student("c",44,55) );
		
		for(student o:x)
		{
			o.show();
		}
		
		System.out.println("=================");
		
		x.add(new student("f",78,65));
		
		
		for(student o:x)
		{
			o.show();
		}

	}

}
