package Stream_demo;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Stream_methode {

	
	
	
	@Test
	public void filter_methode() {
		
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		list.stream().filter(l->l%2==0).forEach(System.out::println);
		
		
		
		
	}
	
	
	
	

	@Test
	public void filter_methode1() {
		
		List<String> list=new ArrayList<>(Arrays.asList("Akash","Anil","Amith","Rajedra","sumith","Akash"));
		 Map<String, Long> collect = list.stream().filter(name->name.length()<=5)
	    .collect(Collectors.groupingBy(group-> group,Collectors.counting()));
		
		collect.forEach((key,value)->{
			System.out.println(key+" => "+value);
		});
		
		
	}
	
	
	@Test
    public void map_demo() {
		List<String> list=new ArrayList<>(Arrays.asList("Akash","Anil","Amith","Rajedra","Sumith","Akash"));
		list.stream().filter(name-> Character.isUpperCase(name.charAt(0)))
		.map(map->Character.toLowerCase(map.charAt(0))+map.substring(1).toUpperCase())
		.forEach(System.out::println);
		
		
		
		
    }
	
	
	
	@Test
	public void Filtermethode() {
		
		String a="akash guttedar";
		
		Map<Character, Long> collect = a.chars().mapToObj(c -> (char)c).filter(p -> p == 'a' || p=='g' )
		.collect(Collectors.groupingBy(b1->b1,Collectors.counting()));
		
		collect.forEach((key,value)->{
			System.out.println(key+" "+ value);
		});
		
		
		
		
	}
	
	@Test
	public void filter_word() {
	    String a="akash guttedar akash khadar khadar";
	    String[] split = a.split(" ");
	    List<String> list= new ArrayList<>(Arrays.asList(split));
	    Set<String> set=new HashSet<>();
	    Stream<String> map = list.stream().filter(m-> !set.add(m))
	    .map(m->m);
	    map.forEach(System.out::println);
		
		
	}
	

	@Test
	public void filter_word_repeat() {
	    String a="akash guttedar akash khadar";
	    String[] split = a.split(" ");
	    List<String> list= new ArrayList<>(Arrays.asList(split));
	    Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(b->b,Collectors.counting()));
		collect.forEach((key,value)->{
			System.out.println(key+" repeat name => "+value+" Times");
		});
		
	}
	
	@Test
	public void Map_find_length() {
		String a="akash guttedar khadar sab";
		 String[] split = a.split(" ");
		 List<String> list= new ArrayList<>(Arrays.asList(split));
		 list.stream()
		 
		 .map(m->m+" length of word = "+m.length())
		 .forEach(System.out::println);
	}
	
	
	@Test
	public void Map_find_tochangecase() {
		String a="akash guttedar khadar sab";
		 String[] split = a.split(" ");
		 List<String> list= new ArrayList<>(Arrays.asList(split));
		 list.stream()
		 .map(m->m+" change charcter as a upper case = "+m.toUpperCase()+" to")
		 .forEach(System.out::println);
	}
	
	@Test
	public void Map_find_tochangecaseinfirest() {
		String a="akash guttedar khadar sab";
		 String[] split = a.split(" ");
		 List<String> list= new ArrayList<>(Arrays.asList(split));
		 list.stream()
		 .map(m->m+" change charcter as a upper case = "+Character.toUpperCase(m.charAt(0))+m.substring(1))
		 .forEach(System.out::println);
	}
	
	
	@Test
	public void sord_value_in_asending_and_desendingorder() {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,5,8,9,2,4,3,6,7));
		System.out.println("The list in asending order");
		list.stream().sorted().forEach(System.out::print);
		System.out.println();
		System.out.println("The list in desending order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println();
		
		
		
	}
	
	
	@Test
	public void remove_duplicate_element_using_distinct_integer()
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(1,5,8,5,3,4,7,6,9,2,4,3,6,7));
		System.out.println("The Remove duplicate element in list");
		list.stream().distinct().sorted().forEach(System.out::print);
		System.out.println();
	}
	
	
	@Test
	public void remove_duplicate_element_using_distinct_String()
	{
		List<String> list=new ArrayList<>(Arrays.asList("Akash","Akash","guttedar","khadara","guttedar"));
		System.out.println("The Remove duplicate element in list");
		list.stream().distinct().sorted().forEach(System.out::println);
		System.out.println();
	}
	
	@Test
	public void limit_skip_peek() {
	
		 List<Integer> list=new ArrayList<>(Arrays.asList(1,5,8,5,3,4,7,6,9,2,4,3,6,7));
		 System.out.println("The Remove duplicate element in list");
		 List<Integer> collect = list.stream().distinct().sorted().peek(p->System.out.println(p))
		 .limit(5).peek(System.out::print).collect(Collectors.toList());
		 collect.forEach(System.out::print);
		 System.out.println();
		
	}
	
	@Test
	public void mapTOInt()
	{
		List<String> list=new ArrayList<>(Arrays.asList("1","2","3","4","5"));
		System.out.println("The list Convert as Integer");
		list.stream().mapToInt(to-> Integer.parseInt(to)).forEach(System.out::println);
		System.out.println();
	}
	
	
	
	
	
	
	@Test
	public void Maptoint_find_length_And_convert_tolist_using_box() {
		 String a="akash guttedar khadar sab";
		 String[] split = a.split(" ");
		 List<String> list= new ArrayList<>(Arrays.asList(split));
		  List<Integer> collect = list.stream()
		  .mapToInt(m->m.length()).boxed().collect(Collectors.toList());
		   collect.forEach(System.out::println);
		 
		 
		 
		 
	}
	
	@Test
	public void flat_map() {
		
		 List<Obect> list=new ArrayList<>();
		 list.add(new Obect("Akash", 25, Arrays.asList("guttedar","guttedar"), 75l));
		 list.add(new Obect("khadar", 26, Arrays.asList("sab","sab"), 65l));
		 list.add(new Obect("shekhar", 27, Arrays.asList("guttedar","guttedar"), 70l));
		 list.add(new Obect("asg", 28, Arrays.asList("gutt","gutt"), 60l));
		 List<String> collect = list.stream().map(Obect::getLastname)
		.flatMap(fl->fl.stream().map(mm->mm)).collect(Collectors.toList());
		 collect.forEach(System.out::println);
		 System.out.println();
		
		
	}
	
	
	
	@Test
	public void reduce() {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		Optional<Integer> reduce = list.stream().reduce((element1,element2)-> element1+element2);
		reduce.ifPresent(c->System.out.println(c));
	}
	
	@Test
	public void reduce_integer_sum() {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
          Integer reduce = list.stream().reduce(0,Integer::sum);
		  assertEquals(reduce,21);
		  System.out.println(reduce);
	}
	
	@Test
	public void reduce_integer_max() {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
          Integer reduce = list.stream().reduce(0,Integer::max);
		  System.out.println(reduce);
	}
	@Test
	public void reduce_max() {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		Optional<Integer> reduce = list.stream().reduce((element1,element2)-> element1>element2?element1:element2);
		reduce.ifPresent(c->System.out.println(c));
	}
	
	
	@Test
	public void findfirstelement() {
		List<String> list=new ArrayList<>(Arrays.asList("Akash","khadar","asg"));
		Optional<String> findFirst = list.stream().findFirst();
		
		assertEquals(findFirst.get(), "Akas");
		if(findFirst.isPresent()) {
			System.out.println("First element find Out");
		}
		
		
	}
	
	
	
	

	@Test
	public void findanyelement() {
		List<String> list=new ArrayList<>(Arrays.asList("Akash","khadar","asg"));
		Optional<String> findAny = list.stream().findAny();
		
		String string = findAny.get();
		System.out.println(string);
		
		assertThat(findAny.get(), anyOf(is("Akash"),is("khadar"),is("asg")));
		if(findAny.isPresent()) {
			System.out.println("any element find Out");
		}
		
		
	}
	
	
	
	
	@Test
	public void consumer_demo() {
		
		
         Consumer<Integer> display=a-> System.out.println(a);
        
         
         
         Consumer<List<Integer>> list1= b-> {
        	 for(int i=0;i<b.size();i++) {
        		b.set(i, 2*b.get(i));
        	 }
         };
         
         
      // Consumer to display a list of numbers
         Consumer<List<Integer> >
             dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
         System.out.println();
         
         List<Integer> list = new ArrayList<Integer>();
         list.add(2);
         list.add(1);
         list.add(3);
         
         
         list1.accept(list);
         dispList.accept(list);
        
         display.accept(10);
	}
	
	
	@Test
	public void consumernew() {
		
		Consumer<String> name=s->System.out.println(s);
		name.accept("Akash guttedar");
		
		
		Consumer<List<String>> listname=list->{
			
		for(int i=0;i<list.size();i++) {
			list.set(i, list.get(i)+" guttedar"+i);
		}
			
		};
		
		Consumer<List<String>> print=p->p.stream().forEach(System.out::println);
		
		 
        List<String> list = new ArrayList<String>();
        list.add("akash");
        list.add("asg");
		
		listname.accept(list);
		print.accept(list);
        
        
        
	}
	
	
	
	
	
	
	@Test
	public void reverse() {
	
		String a="akash";
		a.chars().mapToObj(c->(char)c);
	}
	
	
	
	
	
	
	
	
}
