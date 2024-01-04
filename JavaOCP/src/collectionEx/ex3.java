package collectionEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class ex3 {

	public static void main(String[] args) {
		//HashMap<String,Integer> x=new HashMap();
		//隨機排序
		//重複以後面為主
		TreeMap<String,Integer> x=new TreeMap();
		//排序照大小寫位置排序
		x.put("Aaa", 1000);
		x.put("Bbb", 2000);
		x.put("cbb", 9000);
		System.out.println(x);
		Set<String> k=x.keySet();
		Collection<Integer> v=x.values();
		
		for(String o:k)
		{
			System.out.print(o+" ");
		}
		
		System.out.println("\n======================");
		for(Integer o:v)
		{
			System.out.print(o+" ");
		}
		

	}

}
