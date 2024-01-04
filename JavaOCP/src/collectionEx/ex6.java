package collectionEx;

import java.util.HashSet;

public class ex6 {

	public static void main(String[] args) {
		HashSet<student> s=new HashSet();
		s.add(new student("a",66,77));
		s.add(new student("a",66,77));
		s.add(new student("a",66,77));
		System.out.println(s);
		//記憶體位置不同,相同記憶體內重複只取一個
		for(student o:s) 
		{
			o.show();
		}
		

	}

}
