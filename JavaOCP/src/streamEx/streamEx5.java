package streamEx;

import java.util.Arrays;
import java.util.List;

public class streamEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order2> l = Arrays.asList(
				new Order2("a",5,1),
				new Order2("b",2,5),
				new Order2("c",7,9),
				new Order2("d",9,6));
		l.stream()
		.sorted((o1,o2) -> o2.getSum() - o1.getSum())
		.forEach((o) -> System.out.println(o.show()));

	}

}
