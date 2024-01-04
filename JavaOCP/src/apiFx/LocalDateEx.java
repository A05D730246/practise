package apiFx;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LocalDate l=LocalDate.of(1998, 1, 18);
			System.out.println(l);
			System.out.println(l.isLeapYear());
			System.out.println(l.getDayOfMonth());
			System.out.println(l.getDayOfYear());
			System.out.println(l.format(DateTimeFormatter.ISO_LOCAL_DATE));
			System.out.println(l.format(DateTimeFormatter.ofPattern("MM月 dd日 yyyy年")));

	}

}
