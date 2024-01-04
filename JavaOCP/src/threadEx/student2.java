package threadEx;
class school
{
	
}


public class student2 extends school implements Runnable{
	private String name;



	public student2(String name) {
		super();
		this.name = name;
	}
	
	
	
	
	
	public void show()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(300);
				System.out.println("I="+i+"\t名:"+name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}





	@Override
	public void run() {
		show();
		
	}

}