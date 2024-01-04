package apiFx;

public class stringEx {
	
	public static void main(String[] args) {
		String x=" A dog! ";
		System.out.println(x.charAt(1));
		System.out.println(x.indexOf("d"));
		System.out.println(!x.isEmpty());
		System.out.println(x.length());//包含空格
		System.out.println(x.replace("dog", "aaa"));//複製後修改-->原本值不變
		//x=x.replace("dog", "aaa");---->修改
		System.out.println(x);
		System.out.println(x.toLowerCase());//全部大小寫
		System.out.println(x.toUpperCase());
		
		double abc=10.12;
		System.out.println(String.valueOf(abc)+1);
		System.out.println(""+abc+1);
		
		Double abc2=10.12;//class-->to.String
		System.out.println(abc2.toString()+1);
		
		System.out.println(x);
		System.out.println(x.length());
		
		System.out.println(x.trim());//去掉頭尾空格
		System.out.println(x.trim().length());
		
		System.out.println(x.concat(",132456"));//增加內容
		System.out.println(x);
		
		String y="deft巨匠";
		System.out.println(y);
		
		for(char o:y.toCharArray())
		{
			System.out.print(o+" ,");
		}
		
		char[] aa=y.toCharArray();
		
		System.out.println(aa[4]);
		

	}
}
