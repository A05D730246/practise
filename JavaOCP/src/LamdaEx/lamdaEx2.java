package LamdaEx;
interface book2
{
	void bookStyle(String name,double price);	
}
public class lamdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book2 b1 = (name,price)->System.out.println("java書名:"+name+"\t價格:"+price*0.95);
		b1.bookStyle("java", 1000);
		book2 b2 = (n,p)->
		{
			if(p >= 0) 
			{
				System.out.println("java書名:"+n+"\t價格:"+p*0.95);
			}
			else
			{
				System.out.println("價格需>=0");
			}
		};
		b2.bookStyle("java", -1000);

	}

}
