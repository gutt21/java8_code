package Strings;

import org.testng.annotations.Test;

public class practice {

	
	
	
	//input-akashgutted@gmail.com;
	//output-akshgutted,gmail,com
	
	
	
	
	
	
	
	
	@Test
	public void teet() {
		String a="akashgutted@gmail.com";
		String []b=a.split("@");
		String b1=b[1];
		String c[]=b1.split("\\.");
		System.out.println(b[0]);
		System.out.println(c[0]);
		System.out.println(c[1]);
	}
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void teste() {
		
		
		String a="akashgutted@gmail.coma.";
		boolean flag=false;
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='@'|| a.charAt(i)=='.') {
				flag=true;
			}else if(flag==true) {
				System.out.println(a.substring(i-count, i-1));
			     flag=false;
			       count=0;
			}else {
				
			}
			
			count++;
		}
		
		
	}
	
	
	
	
	
	
}
