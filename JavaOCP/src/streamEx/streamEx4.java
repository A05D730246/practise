package streamEx;

import java.util.Arrays;
import java.util.List;

public class streamEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> l = Arrays.asList(
				new Order("a",1,1),
				new Order("b",2,9),
				new Order("c",7,9),
				new Order("d",1,6));
		l
		.stream()
		.sorted()
		.filter((p) -> p.getSum() >=8000)
		.forEach((o) -> System.out.println(o.show()));

	}

}
