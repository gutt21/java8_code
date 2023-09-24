package Iterator_demo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.testng.annotations.Test;

public class Iterator_enumertion {

	
	
	
	
	@Test
	public void usingString() {
		Vector<String> a=new Vector<>();
		a.add("akash");
		a.add("khadar");
		a.add("asg");
		a.add("sab");
		a.add("shekhar");
		a.add("guttedar");
		a.add("nothing");
		
		System.out.println("using itertor interface");
		Iterator<String> it=a.iterator();
		while(it.hasNext()) {
			if(it.next()=="khadar") {
				it.remove();
			}
			
		}
		System.out.println(a);
		System.out.println("using enumertion ");
		Enumeration<String> em=a.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
	}
	
	
	
}
