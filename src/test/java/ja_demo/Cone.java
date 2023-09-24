package ja_demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cone implements Cloneable {

	
	

	private int age;
	private String name;
	private String lastname;

	public static void main(String[] args) {
		Cone c=new Cone();
		
		Cone cc= new Cone() ;
		c.age=25;
		c.name="akash";
		c.lastname="guttedar";
		
		if(c.age==5) {
			c.age=c.age+1;
		}
		System.out.println(c);
		System.out.println(cc);
	}
	
}
