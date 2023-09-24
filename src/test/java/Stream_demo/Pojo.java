package Stream_demo;

public class Pojo {

	
	
	
	private String name;
	
	private String gender;
	
	private int age;
	
	private String lastname;

	
	
	
	
	
	
	
	
	
	
	
	public Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pojo(String name, String gender, int age, String lastname) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getLastname() {
		return lastname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
