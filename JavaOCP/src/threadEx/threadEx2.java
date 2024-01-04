package threadEx;

public class threadEx2 {

	public static void main(String[] args) throws InterruptedException {
		student s1=new student("a1");
		student s2=new student("a2");
		student s3=new student("a3");
		student s4=new student("a4");
		
		s1.start();//show單工
		s2.start();
		s2.join(5000);//join 間格時間動作
		
		
		s3.start();
		s4.start();
		

	}

}
