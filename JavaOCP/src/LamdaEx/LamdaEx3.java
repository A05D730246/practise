package LamdaEx;

interface book3<E>
{
	void bookStyle(String name,E price);
}

public class LamdaEx3 
{
	public static void main(String[] args) 
	{
		book3<Integer> b1 = new book3<>()
		{

			@Override
			public void bookStyle(String name, Integer price) {
				// TODO Auto-generated method stub
				System.out.println("java書名:"+name+"\t價格:"+price*0.95);				
			}
			
		};
		book3<Double> b2 = new book3<>() 
		{

			@Override
			public void bookStyle(String name, Double price) {
				// TODO Auto-generated method stub
				System.out.println("java書名:"+name+"\t價格:"+price*0.95);
			}
			
		};
		b1.bookStyle("aaa", 999);
		b2.bookStyle("bbbb", 7777.);
	}

}
