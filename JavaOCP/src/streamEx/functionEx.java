package streamEx;

import java.util.function.Function;

public class functionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> f1 = new Function<String,Integer>()//轉型<A->B>
				{

					@Override
					public Integer apply(String t) {
						// TODO Auto-generated method stub
						return Integer.parseInt(t);
					}
			
				};
				String x = "30";
				System.out.println(10 + x);
				System.out.println(10 + f1.apply(x));
				
				Function<String,Integer> f2=(t)->Integer.parseInt(t);
				
				System.out.println(10+f2.apply(x));
		

	}

}
