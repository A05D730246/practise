package LamdaEx;
interface book1
{
	void bookStyle(String name ,double price);
}

class book implements book1
{
	@Override
	public void bookStyle(String name, double price) {
		// TODO Auto-generated method stub
		
			System.out.println("java書名:"+name+"\t價格:"+price*0.95);
		}
		
	}
public class lamdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book1 b1 = new book1() 
		{
			@Override
			public void bookStyle(String name, double price) {
				// TODO Auto-generated method stub
	             System.out.println("java書名:"+name+"\t價格:"+price*0.95);	
			}};
			book1 b2 = (String name,double price)
					->System.out.println("java 書名:"+name+"\t價格:"+price*0.95);
					b2.bookStyle("java11", 750.5);
	}

}
