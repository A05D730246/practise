package streamEx;

public class streamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] x =new Integer [3];
		for(Integer o:x) 
		{
			System.out.print(o + " ");
		}
		System.out.println("\n========================");
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		for(Integer o:x) 
		{
			System.out.print(o + " ");
		}

	}

}
