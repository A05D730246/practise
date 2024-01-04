package util;

import java.io.IOException;

public class readEx {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
			Object o = cal.read("/JavaOCP/work/orderS/bringIn.txt").readObject();
			String o2 = (String) o;
			
			System.out.println(o2);

	}

}
