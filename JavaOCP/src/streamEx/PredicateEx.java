package streamEx;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = new Predicate<Integer>() 
		{

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t>=0;
			}};
			
			System.out.println(p1.test(10));
			
			Predicate<Integer> p2 = (Integer t) -> t >=0;
			System.out.println(p2.test(10));
		}

	}


