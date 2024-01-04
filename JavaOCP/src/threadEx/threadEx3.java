package threadEx;

	public class threadEx3 {
		public static void main(String[] args) {
		student2 s1=new student2("a1");
		student2 s2=new student2("a2");
		student2 s3=new student2("a3");
		student2 s4=new student2("a4");
		
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		Thread t3=new Thread(s3);
		Thread t4=new Thread(s4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		}
}
