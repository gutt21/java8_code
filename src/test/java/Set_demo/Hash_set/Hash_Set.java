package Set_demo.Hash_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Set{

	
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(50);
		
		System.out.println(set);
		for(Integer a:set) {
			System.out.println(a);
		}
		System.out.println("iterator");
		set.remove(50);
		
		Iterator<Integer> g=set.iterator();
		while(g.hasNext()) {
			System.out.println(g.next());
		}
		set.clear();
		System.out.println(set);
		
	}
	
	
}
