package annotationEx;
class ABC<E>
{
	E get(E e) 
	{
		return e;
	}
}
@SuppressWarnings("all")
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ABC<Integer> a=new ABC<>();
				//System.out.println(a.get(100));
				
				ABC a=new ABC();
				System.out.println(a.get(1000));

	}

}
