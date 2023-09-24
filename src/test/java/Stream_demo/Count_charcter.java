package Stream_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Count_charcter {

	
	public static void main(String[] args) {
		
		
		 List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

         List<Integer> ans = list.stream()
                .filter(value -> value % 2 == 0)
                .collect(Collectors.toList());
		
		ans.forEach(System.out::println);
		
		
		
		
		
		String a="akash gutedarr";
	    String []b=a.split("");
		List<String> a1=Arrays.asList(b);
		Set<String> item=new HashSet<>();
		Set<String> filter = a1.stream().filter(n -> !item.add(n)
				).collect(Collectors.toSet());
		filter.forEach(System.out::println);
		setet();
		     
		
		System.out.println("akash guttedar");
		
	    Map<Character, Long> collect = a.chars()
	    			    		.mapToObj(c -> (char) c).collect(Collectors.groupingBy(b1 -> b1,Collectors.counting()));
		collect.forEach((key,value)->{
			if(!key.equals(' ') && value>1) {
			System.out.println(key+" "+value);
			}
		});
		
	}
	
	
	public static void setet() {
		
		Set<String> a=new HashSet<>();
		a.add("a");
		a.add("a");
		a.add("b");
		
        List<String> collect = a.stream().filter(n->n =="a").collect(Collectors.toList());		
		
		
		collect.forEach(System.out::println);
		
		
		
	}
	
	
	
	
	@Test
	public void testet() {
		
	int	x=10;
		
	  for(int i =0; i<5;i++) {
		  System.out.println(x++);
		  System.out.println(x--);
	  }
	
		
	}
	
	@Test
	public void countchar() {
		
		
		

		
		String a="akasha guttead Khadhar";
		Map<Character, Long> collect = a.chars().mapToObj(m-> (char) m)
		.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		collect.forEach((k,v)-> {
				System.out.println(k+" "+v);
		});
		
		
		String[] split = a.split(" ");
		List<String> list= new ArrayList<>(Arrays.asList(split));
		Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(m->m,Collectors.counting()));
		collect2.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
		
		
		list.stream().map(m->m).sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		
	}
	
	//it is input Simth Ltimindtree
	//output Ltimindtree smith
	
	
	
	
	
	
	
	
	
}
