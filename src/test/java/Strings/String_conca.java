package Strings;

import java.util.Collections;

import org.testng.annotations.Test;

import com.google.common.primitives.Booleans;

public class String_conca {

	
	
	@Test
	public void test()
	{
		
		/*
		 * Input: String 1 : abc 
		 * String 2 : def 
		 * String n-1 : ... 
		 * String n : xyz 
		 * Output:
		 * abcdef...xyz
		 */ 
		
		String a="abc";
		String a2="def";
		String a3="...";
		String n="xyz";
		
		String d=a.concat(a2.concat(a3).concat(n));
		System.out.println(d);
		String e=d.concat(a3);
		String f=e.concat(n);
		System.out.println(f);
		
	
	}
	
	
	
	
	
}
