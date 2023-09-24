package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

public class Array_list {

	
	
	@Test
	public void Find_duplicate() {
		
		ArrayList ar=new ArrayList<>();
		ar.add("akash");
		ar.add("akash");
		ar.add("cricket");
		ar.add("footbal");
		ar.add("cricket");
		ar.add("akash");
		int count=0;
		for(int i=0;i<ar.size();i++) {
			count=1;
			for(int j=i+1;j<ar.size();j++) {
				if(ar.get(i)==ar.get(j)) {
					count++;
					ar.remove(j);
				}
			}
			System.out.println(ar.get(i)+" "+count+" times");
		}
		
		
	}
	
	
	
	@Test
	public void Find_duplicate2() {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("akash");
		ar.add("akash");
		ar.add("cricket");
		ar.add("footbal");
		ar.add("cricket");
		ar.add("akash");
		 HashMap<String,Integer>h=new HashMap<String, Integer>();
		   for(int i=0;i<ar.size();i++) {
			           
			   if(h.get(ar.get(i))== null) {
						  h.put(ar.get(i), 1);
					  }
					   else {
						  h.put(ar.get(i), h.get(ar.get(i))+1);
				   }
		   }
		   Iterator<Map.Entry<String,Integer>>mm=h.entrySet().iterator();
		   while(mm.hasNext()) {
			   Map.Entry<String,Integer>k=mm.next();
			   if(k.getValue()>1) {
				   System.out.println(k.getKey()+" = "+k.getValue()+" times ");
			   }
		   }
	}
	
	
	
	
	
}
