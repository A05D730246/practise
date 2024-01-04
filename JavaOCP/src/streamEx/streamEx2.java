package streamEx;

import java.util.ArrayList;
import java.util.List;

public class streamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList();
		//<>定要大寫(class)
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		for(Integer o:l) 
		{
			System.out.print(o + " ");
		}
		System.out.println("\n=============================");
		
		l.add(900);
		
		for(Integer o:l) 
		{
			System.out.print(o + " ");
		}
		System.out.println("\n=============================");
		
		Object[] x = l.toArray() ;//轉型上索引碼
		System.out.print(x[2]);

	}

}
