package apiFx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localDateTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime l=LocalDateTime.now();
		//LocalDate l=LocalDate.of(1998, 1, 18);
		System.out.println(l);				
		System.out.println(l.getDayOfMonth());
		System.out.println(l.getDayOfYear());
		System.out.println(l.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		System.out.println(l.format(DateTimeFormatter.ofPattern("MM月 dd日 yyyy年")));
		
		System.out.println(l.format(DateTimeFormatter.ofPattern("MM月-dd日-yyyy年 HH:mm:ss")));

	}

}
