package collectionEx;

public class student implements Comparable<student>{
	private String name;
	private int chi;
	private int eng;
	private int sum;
	public student(String name, int chi, int eng) {
		super();
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		this.sum = sum;
		sum=chi+eng;
	}
	
	public void show()
	{
		System.out.println("姓名:"+name+"\t國文:"+chi+"\t英文:"+eng+"\t總分:"+sum);
	}

	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return this.sum-o.sum;
	}
	
	

}
