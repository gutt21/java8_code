package Stream_demo;

import java.util.List;

public class Obect {

	
	private String name;
	
	private int age;
	
	private List<String> lastname;
	
	private Long marks;


	public Obect() {
		super();
	}


	public Obect(String name, int age, List<String> lastname, Long marks) {
		super();
		this.name = name;
		this.age = age;
		this.lastname = lastname;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public List<String> getLastname() {
		return lastname;
	}


	public Long getMarks() {
		return marks;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setLastname(List<String> lastname) {
		this.lastname = lastname;
	}


	public void setMarks(Long marks) {
		this.marks = marks;
	}
	
	
	
	
	
}
