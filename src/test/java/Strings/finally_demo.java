package Strings;

import org.testng.annotations.Test;

public class finally_demo {




	public static int returnint() {

		try {
			System.out.println(5/0);
			return 1;

		}catch(Exception e) {
			return 2;
		}finally {
			System.out.println("inside the final block");
			return 3;
		}

	}
	public static int returnint2() {
       int i=0;
		try {
			i++;
			System.out.println(5/0);
			

		}catch(ArithmeticException e) {
			System.out.println("hello");
			i++;
		}finally {
			System.out.println("inside the final block");
			 i++;
		}
		return i;
	}
	@Test
	public void returntest() {
		int a=returnint2();
		System.out.println(a);

	}













	@Test
	public void test1() {

		try {
			int a=20;
			int b=0;
			System.out.println(a/b);
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}finally {
			System.out.println("finally");
		}


	}


	@Test
	public void test2() {

		try {
			int a=20;
			int b=10;
			System.out.println(b/a);

		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}finally {
			System.out.println("finally");
		}


	}
}
