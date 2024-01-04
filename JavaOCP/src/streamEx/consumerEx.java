package streamEx;

import java.util.function.Consumer;

public class consumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = new Consumer<String>() 
		{

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
				
			}};
			c.accept("aaaaa");
			
			Consumer<String> c2 = (t) -> System.out.println(t);
			c2.accept("bbbb");
		}

	}

