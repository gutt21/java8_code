package compartor_caomparable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Testing_class {

	
	
	
	
	@Test
	public void comparable() {
		
		List<Employe> list=new ArrayList<>();
		list.add(new Employe("Akash", "user", 25));
		list.add(new Employe("Khadar", "Adime", 26));
		list.add(new Employe("Shekhar", "cricket2", 24));
		list.add(new Employe("Asg", "cricket1", 23));
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
		
	}
	
	@Test
	public void comprator_age() {
		List<Stundent> list=new ArrayList<>();
		list.add(new Stundent("Akash",25,"govet","user"));
		list.add(new Stundent("Khadar",25, "govet1","Adime"));
		list.add(new Stundent("Shekhar",24,"govetk" ,"cricket2"));
		list.add(new Stundent("Asg",23, "private","cricket1"));
		
		Collections.sort(list,new Age_comprator());
		
		list.forEach(System.out::println);
	}
	
	
	@Test
	public void comprator_name() {
		List<Stundent> list=new ArrayList<>();
		list.add(new Stundent("Akash",25,"govet","user"));
		list.add(new Stundent("Khadar",25, "govet1","adime"));
		list.add(new Stundent("Shekhar",24,"govetk" ,"cricket2"));
		list.add(new Stundent("Asg",23, "private","cricket1"));
		
		Collections.sort(list,new name_comprator());
		
		list.forEach(System.out::println);
	}
	
	
	@Test
	public void comprator_role() {
		List<Stundent> list=new ArrayList<>();
		list.add(new Stundent("Akash",25,"govet","user"));
		list.add(new Stundent("Khadar",25, "govet1","adime"));
		list.add(new Stundent("Shekhar",24,"govetk" ,"cricket2"));
		list.add(new Stundent("Asg",23, "private","cricket1"));
		
		Collections.sort(list,new role_comparter());
		
		list.forEach(System.out::println);
	}
	
}
