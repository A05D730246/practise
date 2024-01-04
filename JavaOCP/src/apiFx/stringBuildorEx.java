package apiFx;

public class stringBuildorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder x=new StringBuilder(" A dog! ");
		
		System.out.println(x);
		System.out.println(x.append(" afgudkjf"));
		System.out.println(x);
		System.out.println(x.charAt(3));
		System.out.println(x.indexOf("dog"));
		System.out.println(x.length());
		System.out.println(x.replace(11, 14, "AAA"));//改11-14字元
		
		String y=x.toString();
		
		System.out.println(y);

	}

}
