package compartor_caomparable;

public class Stundent {

	
	public String name;
	
	public int age;
	
	public String School;
	
	public String role;

	public Stundent(String name, int age, String school, String role) {
		super();
		this.name = name;
		this.age = age;
		School = school;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Stundent [name=" + name + ", age=" + age + ", School=" + School + ", role=" + role + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSchool() {
		return School;
	}

	public String getRole() {
		return role;
	}
	
	
	
	
	
	
}
