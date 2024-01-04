package LamdaEx;
interface book6<E,T>
{
	String bookStytle(String bookname,E price,T amount);
}
public class LamdaEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book6<Integer,Integer> b1 = cal ::s1;
		System.out.println(b1.bookStytle("aaa", 5000, 20));
		
		book6<Double,Integer> b2 = cal ::s2;
		System.out.println(b2.bookStytle("aaa", 6000., 20));
		
		book6<Double,Double> b3 = cal ::s3;
		System.out.println(b3.bookStytle("aaa", 6000., 20.));

	}

}
class cal
{
	public static String s1(String bookName,Integer price,Integer amount) 
	{
		if(price>=0 && amount>=0)
		{
			return "書名 : "+bookName+"\t價格 : "+price*0.95+"\t數量 : "+amount;
		}
		else 
		{
			return "價格與數量需>=0";
		}
	}
	public static String s2(String bookName,Double price,Integer amount)
	{
		if(price>=0 && amount>=0)
		{
			return "書名 : "+bookName+"\t價格 : "+price*0.95+"\t數量 : "+amount;
		}
		else 
		{
			return "價格與數量需>=0";
		}
	}
	public static String s3(String bookName,Double price,Double amount)
	{
		if(price>=0 && amount>=0)
		{
			return "書名 : "+bookName+"\t價格 : "+price*0.7+"\t數量 : "+amount;
		}
		else 
		{
			return "價格與數量需>=0";
		}
	}
}