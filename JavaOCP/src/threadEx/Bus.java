package threadEx;

public class Bus extends Thread{
	private static int sum;
	
	public void run() 
	{
		for(int i=1;i<=20;i++)
		{
			try {
				Thread.sleep(300);
				add(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}	
	public synchronized static void add(int pay)
	//synchronized取消static內多工,若無會隨機覆蓋結果每次都不相同
	{
		int temp=sum;
		System.out.println("目前總金額="+temp);
		System.out.println("新進一筆金額:"+pay);
		temp=temp+pay;
		System.out.println("目前最新總金額="+temp);
		sum=temp;
		System.out.println("");
	}

}
