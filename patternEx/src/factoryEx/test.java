package factoryEx;

public class test {

	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();		
		style1 s1=new style1(a1,b1);		
		style1 s2=new style1(new A(),new B());
		style1 s3=new style1();
		
		System.out.println(s1);
		System.out.println(s1.getA().show()+"\t"+s1.getB().show());
		
		/*System.out.println(s2);
		System.out.println(s2.getA()+"\t"+s2.getB());
		
		System.out.println(s3);
		System.out.println(s3.getA()+"\t"+s3.getB());
		
		System.out.println("=================");
		
		style2 s4=new style2();
		style2 s5=new style2(new A(),new C());
		
		
		System.out.println(s4);
		System.out.println(s5);*/
		
		

	}

}