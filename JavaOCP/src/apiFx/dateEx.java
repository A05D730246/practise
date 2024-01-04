package apiFx;

import java.util.Date;

public class dateEx {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		System.out.println(1900+d.getYear());
		System.out.println(1+d.getMonth());
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		
		

	}

}