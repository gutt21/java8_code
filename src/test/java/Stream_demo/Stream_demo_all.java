package Stream_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Stream_demo_all {

	
	
	
	
	
	
	
	
	@Test
	public void checkthegeneder() {
		
	   List<Pojo> list=new ArrayList<>();
	   list.add(new Pojo("akash", "male", 25, "guttedar"));
	   list.add(new Pojo("tanu", "female", 10, "bhandari"));
	   list.add(new Pojo("khadar", "male", 26, "sab"));
	   list.add(new Pojo("neharika", "female", 8, "bhandari"));
	   list.add(new Pojo("rukumayy", "male", 21, "guttedar"));
		
	   Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(b->b.getGender(),Collectors.counting()));
	   
	   collect2.forEach((key,value)->{
		   System.out.println(key+" "+value);
	   });
	   Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Pojo ::getGender,Collectors.counting()));
	   collect.forEach((key,value)->{
		   System.out.println(key+" "+value);
	   });
		
	}
	
	
	
	
	@Test
	public void find_out_all_the_numbers_starting_with_1_using_Stream_functions() {
		List<Integer> asList = Arrays.asList(10,12,20,54,15);
		asList.stream().map(m-> String.valueOf(m)).filter(f->f.startsWith("1"))
		.forEach(System.out::println);
	}
	
	
	@Test
	public void finddublicate() {
		List<Integer> asList = Arrays.asList(10,12,20,54,15,10,20,54);
		
		HashSet<Integer> set=new HashSet<>();
		asList.stream().filter(f-> !set.add(f)).forEach(System.out::println);
	}
	
	
	@Test
	public void finddublicate1() {
		List<Integer> asList = Arrays.asList(10,12,20,54,15,10,20,54);
		asList.stream().sorted().distinct().forEach(System.out::println);
	}
	
	
	@Test
	public void findthefirstelement() {
		List<Integer> asList = Arrays.asList(13,12,20,54,15,10,20,54);
		asList.stream().findFirst().ifPresent(System.out::println);
	}
	
	
	@Test
	public void findthetotalelement() {
		List<Integer> asList = Arrays.asList(13,12,20,54,15,10,20,54);
		Long collect = asList.stream().count();
		System.out.println(collect);
	}
	
	
	
	@Test
	public void findthetotalelement2() {
		List<Integer> asList = Arrays.asList(13,12,20,54,15,10,20,54);
		Long collect = asList.stream().collect(Collectors.counting());
		System.out.println(collect);
	}
	
	
	
	// FindMaxElement
	@Test
	public void FindMaxElement() {
		List<Integer> asList = Arrays.asList(13,12,20,54,15,10,20,54);
	     Integer integer = asList.stream().max(Integer::compare).get();
		 System.out.println(integer);
	}
	
	
	
	@Test
	public void FindMinElement() {
		List<Integer> asList = Arrays.asList(13,12,20,54,15,10,20,54);
	     Integer integer = asList.stream().min(Integer::compare).get();
		 System.out.println(integer);
		 
		 int a[]= {1,2,3,4,5,6,7};
		 int asInt = Arrays.stream(a).max().getAsInt();
		 System.out.println(asInt);
		 
		 int asInt2 = Arrays.stream(new int[] {1,2,3}).max().getAsInt();
		 System.out.println(asInt2);
		 	
	}
	
	
}
