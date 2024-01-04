package factoryEx;

public class style2 {	
	private A a;
	private C c;
	
	public style2() {
		super();
		a=new A();
		c=new C();
	}
	
	public style2(A a, C c) {
		super();
		this.a = a;
		this.c = c;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
	
	
	
	
	
	

}