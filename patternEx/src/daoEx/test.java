package daoEx;
//包含靜態+動態
/******************靜態*********************/
public class test {
	private String name;
public test() {
		super();
		// TODO Auto-generated constructor stub
	}

public test(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static void show() 
{
	System.out.println("hello java");
	}
/******************動態*********************/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test("aaa");
		System.out.println(t.name);
		System.out.println(t.getName());
		
		test.show();

	}

}
