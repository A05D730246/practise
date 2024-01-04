package streamEx;

import java.util.function.Supplier;

class member
{
	void show() 
	{
		System.out.println("aaaaa");
	}
}

public class supplierEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		member m1 = new member();
		m1.show();
		
		System.out.println("=============================");
		
		Supplier<member> s = new Supplier<member>() 
		{

			@Override
			public member get() {
				// TODO Auto-generated method stub
				return new member();
			}
			
		};
		s.get().show();
		
		Supplier<member> s2 = () ->new member();
		s2.get().show();

	}

}
