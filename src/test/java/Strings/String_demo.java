package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class String_demo {



	@Test
	public void test1() {
		String a=" I love India";
		String b[]=a.split(" ");

		for(int i=b.length-1;i>0;i--) {
			System.out.print(b[i]+" ");
		}

		System.out.println();		
	}


	@Test
	public void test2() {
		String a="I love India";
		String c="";
		for(int j=0;j<a.length();j++) {
			
			if(Character.isLowerCase(a.charAt(j))) {
				c=c+Character.toUpperCase(a.charAt(j));
			}
			else if(Character.isUpperCase(a.charAt(j))) {
				c=c+Character.toLowerCase(a.charAt(j));
			}
			else {
				c=c+a.charAt(j);
			}
		}
		
		System.out.println(c);
		String b[]=c.split(" ");
		for(int i=b.length-1;i>=0;i--) {
			
			if(i==2) {
				System.out.print(b[i-2]+" ");
			}
			else if(i==1) {
				System.out.print(b[i+1]+" ");
			}
			else {
				System.out.print(b[i+1]+" ");
			}
			
			
			
		}

		System.out.println();		
	}


   @Test
	public void ttttt() {
		Pattern p=Pattern.compile("\\D*");
		Matcher m=p.matcher("akash");
		boolean falg=true;
		while(falg) {
			if(m.find()) {
				System.out.println(m.group()+" "+m.start()+" "+m.end());
				falg=false;
			}
		}
	}
	
	
	
	
	
}
