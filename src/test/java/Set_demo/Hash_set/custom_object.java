package Set_demo.Hash_set;

public class custom_object {

	private int id;
	
	private String name;
	
	private int age;
	
	private String School;

	
	
	
	
	
	
	public custom_object() {

	}

	public custom_object(int id, String name, int age, String school) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.School = school;
	}

	public int getId() {
		return id;
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

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSchool(String school) {
		School = school;
	}

	@Override
	public String toString() {
		return "custom_object [id=" + id + ", name=" + name + ", age=" + age + ", School=" + School + "]";
	}
	
	
	@Override
	public boolean equals(Object o) {
		// null  check
		
		if(o == null) {
			return false;
		}
		 //this instance check
		if (this == o) {
			return true;
		}
		
		if((o instanceof custom_object) && (((custom_object) o).id) == this.id) {
			return true;
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		int result =0;
		result =(int) (id/11);
		return result;
	}
	
	
}
