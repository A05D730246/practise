package LamdaEx;

interface book4<E>
{
	void bookStyle(String name,E price);
}

public class LamdaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		book4<Integer> b1 = (name,price)->
		System.out.println("java書名:"+name+"\t價格:"+price);
		
		b1.bookStyle("aaaa",9999);
		
		book4<Double> b2 = (name,price)->
		System.out.println("java書名:"+name+"\t價格:"+price);
		
		b2.bookStyle("bbbb", 7777.);

	}

}
