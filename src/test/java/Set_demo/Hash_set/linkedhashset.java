package Set_demo.Hash_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {

	
	public static void main(String[] args) {
		
		
		
		custom_object e=new custom_object(1, "akash", 25, "dsatm");
		custom_object e1=new custom_object(2, "khdar", 26, "ds");
		custom_object e2=new custom_object(3, "shekha", 26, "dsa");
		custom_object e3=new custom_object(1, "akash", 25, "dsatm");
		
		//if you remove the dublicate element in own cutsome 
		//object just uset hascode overide methode inside the custom object class
		
		
		
		
		
		LinkedHashSet< custom_object> set=new LinkedHashSet<>();
		set.add(e);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		System.out.println(set);
		for(custom_object a:set) {
			System.out.println(a);
		}
		System.out.println("iterator");
		set.remove(50);
		
		Iterator<custom_object> g=set.iterator();
		while(g.hasNext()) {
			System.out.println(g.next());
		}
	}
}
