package Map_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_demo {

	
	public static void main(String[] args) {
		
		Map<Integer, String> h=new HashMap<>();
		h.put(1, "akash");
		h.put(2, "khadar");
		h.put(3, "shekhar");
		h.put(4, "ramesh");
		h.put(5, "patil");
		h.put(2, "khadar sab");
		System.out.println(h);
		
		Iterator<Map.Entry<Integer, String>> it = h.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<Integer, String> pair = it.next();
		    System.out.println(pair.getKey()+" = "+pair.getValue());
		}
	
		
		String s="iamakashguttedar";
	  char[] a = s.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		for(char a1:a) {
			if(!map.containsKey(a1)) 
				map.put(a1, 1);
			else  
				map.put(a1, map.get(a1)+1);
		}
		
		Iterator<Map.Entry<Character, Integer>> it1 = map.entrySet().iterator();
		while (it1.hasNext()) {
		    Map.Entry<Character, Integer> pair = it1.next();
		    System.out.println(pair.getKey()+" = "+pair.getValue());
		}
		
		
	}
}
