package annotationEx;

class school
{
	void show() 
	{
		System.out.println("aaaaaa");
	}
	
}
class A
{
	//@Override
	void show() 
	{
		System.out.println("bbbbbb");
	}
}
public class ex1 {
	
	public static void main(String[] args) {
		new A().show();
		
	}
}
