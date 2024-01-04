package threadEx;

public class threadEx1 {

	public static void main(String[] args)//主執行續 
	   {
		student s=new student("a");
		s.show();//<----沒看見main副執行續
		
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(200);
				System.out.println("i="+i+"\thello thread");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}