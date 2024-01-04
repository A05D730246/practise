package collectionEx;

public class ex1 {

	public static void main(String[] args) 
	{
		int[] x=new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		for(int o:x) 
		{
			System.out.print(o+" ");
		}
			
		System.out.print("\n==========================");
		x[3]=40;//無法無條件增加
		for(int o:x) 
		{
			System.out.print(o+" ");
		}
	}

}
