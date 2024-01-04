package collectionEx;

import java.util.PriorityQueue;

public class ex8 {

	public static void main(String[] args) {
		PriorityQueue<student> s=new PriorityQueue();
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
