package Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

public class reperat {

	
	
	
	
	
	@Test
	public void testefgfg() {
		
		
		String a="i am good";
		
		
		
	}
	
	
	
	
	@Test
	public void test() {
		String a="akasha";
		String []b=a.split("");
		HashMap<String ,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<b.length;i++) {
			
			if(hm.get(b[i])==null) {
				hm.put(b[i], 1);
			} 
			else {
				hm.put(b[i], hm.get(b[i])+1);
			}
		}
	Iterator<Map.Entry<String, Integer>> m=hm.entrySet().iterator();
	while(m.hasNext()) {
		Map.Entry<String, Integer> k=m.next();
		if(k.getValue()>=1) {
			System.out.println(k.getKey()+" "+k.getValue());
		}
	}
		
	}
	
	
	@Test
	public void teste() {
		
		int []a= {1,2,3};
		for(int i=0;i<a.length;i++) {
			i+=a[i];
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		String a="I am good";
		a=a.replace(" ", "");
		String b[]=a.split("");
		HashMap<String ,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<b.length;i++) {
			if(b[i]!=" ") {
				if(hm.get(b[i])==null) {
				hm.put(b[i], 1);
			}
			else {
				hm.put(b[i], hm.get(b[i])+1);
			}
		}
		}
	      hm.forEach((bb,v) ->{
	    	 System.out.println(bb+" " +v);  
	      });
	      Iterator<Map.Entry<String, Integer>> m=hm.entrySet().iterator();
	        System.out.println("character    value times ");
	        while(m.hasNext()) {
		    Map.Entry<String, Integer> k=m.next();
			System.out.println(k.getKey()+"   =       "+k.getValue());
		
	}
		
	}
	
	
	
}
