package Set_demo.Hash_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tress_set {


	
	
	public static void main(String[] args) {

		
		
		//if you remove the dublicate element in own cutsome 
		//object just uset hascode overide methode inside the custom object class
		
		
		
		
		
		Set<Integer> set=new TreeSet();
		set.add(2);
		set.add(4);
		set.add(3);
		set.add(1);
		
		
		
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
	}
	
	
}
