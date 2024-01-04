package apiFx;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LocalTime l=LocalTime.now();
			System.out.println(l);
			
			System.out.println(l.format(DateTimeFormatter.ISO_LOCAL_TIME));
			System.out.println(l.format(DateTimeFormatter.ofPattern("hh點 mm分  ss秒")));

	}

}
