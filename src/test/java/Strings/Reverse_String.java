package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.testng.annotations.Test;

public class Reverse_String {

	
	
	@Test
	public void reverse_the_words() {
		//input a=I love India
		//Output a=India love I
		String a="I love India";
		String b[]=a.split("");
		for(int i=b.length-1;i>=0;i--) {
			System.out.print(b[i]+"");
		}
	
		System.out.println();
	}
	
	
	
	@Test
	public void reverse_Each_words() {
		//input a=I love India
		//Output a=aidnI evol I 
		
		String a="I love India";
		System.out.println(a.length());
		String reve="";
		
		for(int i=a.length()-1;i>=0;i--) {
           reve=reve+a.charAt(i);
		}
		
		String b[]=reve.split(" ");
		System.out.println(b.length);
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}
		
	System.out.println();
	}
	
	
	@Test
	public void additional_in_String() {
		String a="ak1a5s6h8";
		char c[]=a.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++) {
			if(Character.isDigit(c[i])) {
				int num=Character.getNumericValue(c[i]);
				sum=sum+num;
			}
		}
		System.out.println(sum);
		
		
	}
	
	
	@Test
	public void additional_in_whole_String() {
		String a="a55b5n";
		boolean flag=false;
		int sum=0;
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(Character.isDigit(a.charAt(i))) {
				flag=true;
				count++;
				
			}else if(flag) {
				sum=sum+Integer.parseInt(a.substring(i-count,i));
				flag=false;
				count=0;
			}
		}
		System.out.println(sum);
	}

		
		
		
   @Test
	public void additional_in_whole_String1() {
		String a="ak1a56s6h8g";
		boolean flag=false;
		String st="";
		for(int i=0;i<a.length();i++) {
			if(Character.isDigit(a.charAt(i))) {
				st=st+a.charAt(i);
				//flag=true;
				
			}else if(!Character.isDigit(a.charAt(i))) {
				st=st+" ";
				//flag=false;
			}
		}
		System.out.println(st);
		
		
	}
	
	// input=abc786ABC && output=ABC786abc & output=ABC7+8+6abc
	@Test
	public void additional_numerical_inString() {
		String a="abc786ABC";
		String b="";
		int sub=0;
		for(int i=0;i<a.length();i++) {
			
			if(Character.isLowerCase(a.charAt(i))) {
				b=b+Character.toUpperCase(a.charAt(i));
			
			}else if(Character.isUpperCase(a.charAt(i))){
				
				b=b+Character.toLowerCase(a.charAt(i));
			
			}else if (Character.isDigit(a.charAt(i))){
				b=b+a.charAt(i);
				sub=sub+Character.getNumericValue(a.charAt(i));
				
			}
			
			
		}
		System.out.println(sub);
		System.out.println(b);
		
	}
	
	
	@Test
	public void teste() {
		String a="AkashkhadarAkashkhadarAkashAkash";
		String b="Akash";
		String b1="khadar";
		int number=a.indexOf(b, 4);
		System.out.println(number);
		int count=0;
		int count1=0;
		for(int i=0;i<a.length();i++) {
			
			if(b.charAt(0)==a.charAt(i)) {
				count1++;
				if(a.indexOf(b, i)==i) {
					count++;
				}
				
				
			}
			
			
			
		}
		
		
		System.out.println(count);
		
		
	}
	
	
	
	
	
	@Test
	public void vowel()
	{
		String vowel="aeiouAEIOU";
		
		System.out.println("b");
		System.out.println('b'+'c');
		
			
			if(vowel.indexOf('F')>=0) {
				System.out.println("it vowel");
			}else {
				System.out.println("it is not vowel");
			}
		
	}
	
	
	@Test
	public void testt() {
		String a="akash";
		a=null;
		System.out.println(a);
	}
	
	
	@Test
	public void palindrome() {
		
		String a="akash";
		String rev=" ";
	
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		
		System.out.println(rev);
		if(rev.equals(a)) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
	}
	
	
	@Test
	public void anagrom()
	{
		String a="Brag";
		String b="Grab";
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
		
		
		Arrays.sort(c);
		Arrays.sort(d);
		System.out.println(c);
		System.out.println(d);
		
		
	}
	
	
	
	
	@Test
	public void revers_with_words() {
		
		String a="i love india, i am in karnatak, i love cricket";
		String b[]=a.split(",");
		int co=0;
		for(int i=b[co].split(" ").length-1;i>=0;i--) {
			for(int j=b[co].split(" ").length-1;j>=0;j--) {
				String b1[]=b[co].split(" ");
				System.out.print(b1[j]+" ");
			}
			//System.out.println();
			co++;
			
			
		}
		
		
		
	}
	
	
	
	@Test
	public void tesrtee() {
	try {
		int a=10/0;
	
	}catch (ArithmeticException e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("hello");
	}
	System.out.println("system");
	
	
	}
	

	@Test
	public void tesrtee1() {
		int i=0;
	try {
	  i++;
		
		throw new NullPointerException();
		
	}catch (ArithmeticException e) {
		i++;
	}
	finally {
		++i;
		System.out.println("hello");
	}
	
	System.out.println(i);
	
	
	}
	
	@Test
	public void testi() {
		int i=10;
		System.out.println(i++);//10
		System.out.println(i);//11
		System.out.println(++i);//12
		
		
		
	}
	
	
}
