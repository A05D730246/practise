package LamdaEx;

interface book5<E,T>
{
	String book5Style(String bookName,E price,T amount);
}

public class LamdaEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book5<Double,Integer> b1 = (bookName,price,amount) ->
		{
			if(price >= 0 && amount >= 0) 
			{
				return "書名 : "+bookName+"\t價格 : "+price+"\t數量 : "+amount;
			}
			else 
			{
				return "價格與術數量 >= 0";
			}
		};
		System.out.println(b1.book5Style("aaa", 777., 90));

	}

}
