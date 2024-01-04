package collectionEx;

import java.util.TreeSet;

public class ex7 {

	public static void main(String[] args) 
	{
		TreeSet<student> s=new TreeSet();
		
		s.add(new student("a",66,77));
		s.add(new student("b",84,39));
		s.add(new student("c",55,43));
		System.out.println(s);
		for(student o:s) 
		{
			o.show();
		}
	}

}
