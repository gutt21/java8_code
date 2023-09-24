package compartor_caomparable;

public class Employe implements Comparable<Employe>{

	
	private String name;
	
	private String role;
	
	private int age;
	public Employe(String name, String role, int age) {
		super();
		this.name = name;
		this.role = role;
		this.age = age;
	}

	
	
	
	@Override
	public String toString() {
		return "Employe [name=" + name + ", role=" + role + ", age=" + age + "]";
	}




	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Employe o) {
		
		
		
		
		return name.compareTo(o.name);
		
		
		
		
		
		
		
		
		
		
		/*if(age==o.age) {
			return 0;
		}
		if(age>o.age) {
			return 1;
		}
		else {
		 return -1;
		}*/
	}
	
	
	
	
	
}
