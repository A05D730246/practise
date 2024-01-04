package collectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> x=new ArrayList();
		//HashSet<Integer> x=new HashSet();
		//隨機排序,重複只取一個
		//TreeSet<Integer> x=new TreeSet();
		//小到大排序
		//PriorityQueue<Integer> x=new PriorityQueue();
		//小到大可重複
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(10);
		//System.out.println(x);
		for(Integer o:x) {
			System.out.print(o +" ");
		}
		System.out.println("\n=========================");
		x.add(50);//可無條件增加
		x.add(60);
		x.add(8);
		for(Integer o:x) {
			System.out.print(o +" ");
		}
		

	}

}
