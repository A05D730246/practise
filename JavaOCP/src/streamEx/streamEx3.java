package streamEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(10,20,30,40);
		//System.out.println(l);
		Stream<Integer> s = l.stream();
		// l 串 s
		Consumer<Integer> c = (t) ->System.out.print(t + " ");
		//裡面(10,20,30,40)都要做一次一樣的動作System.out.print(t + " ");
		s.forEach(c);
		//執行
		
		System.out.println("\n=========================");
		
		List<Integer> l2=Arrays.asList(10,20,30,40);
		Stream<Integer> s2=l2.stream();
		s2.forEach((t)->System.out.print(t+" ,"));
		//簡化
		
		System.out.println("\n=========================");
		
		List<Integer> l3 = Arrays.asList(10,20,30,40);
		l3.stream().forEach((t) -> System.out.print(t+" ,"));
		//簡化
		
		System.out.println("\n=========================");
		
		Arrays.asList(10,20,30,40).stream().forEach((t)-> System.out.print(t+" ,"));
		//簡化
		
		System.out.println("\n=========================");
		Arrays
		.asList(10,20,30,40)
		.stream()
		.forEach((t)-> System.out.print(t+" ,"));
		
		System.out.println("\n=========================");
		
		Arrays
		.asList(10,20,30,40,2,6,90,70)
		.stream()
		.sorted()//由小到大排序
		.forEach((t)-> System.out.print(t+" ,"));
		
		System.out.println("\n=========================");
		
		Arrays
		.asList(10,20,30,40,2,6,90,70)
		.stream()
		.sorted()//由小到大排序
		.filter((t) -> t>=30)//篩選
		.forEach((t)-> System.out.print(t+" ,"));
		
		System.out.println("\n=========================");
		
		

	}

}
