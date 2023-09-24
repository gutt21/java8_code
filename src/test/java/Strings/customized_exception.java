package Strings;

import org.testng.annotations.Test;

public class customized_exception extends Exception {
	public  customized_exception(String rt) {
		super(rt); 
	}
}
class age {
	@Test
	static void test() throws customized_exception {
		int age=20;
		try {
			if(age<30) {
				throw new customized_exception("efffsfs");
			}else {
				System.out.println("done");
			}
		}catch(customized_exception e) {
			e.printStackTrace();
		}
	}
}