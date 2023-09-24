package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

import com.beust.ah.A;

public class numerical {

	
	
	public static void main(String[] args) {
		String a="I am good";
		a=a.replace(" ", "");
		String b[]=a.split("");
		HashMap<String ,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<b.length;i++) {
			if(b[i]!=" ") {
				if(hm.get(b[i])==null) {
				hm.put(b[i], 1);
			}
			else {
				hm.put(b[i], hm.get(b[i])+1);
			}
		}
		}
	      Iterator<Map.Entry<String, Integer>> m=hm.entrySet().iterator();
	        System.out.println("character    value times ");
	        while(m.hasNext()) {
		    Map.Entry<String, Integer> k=m.next();
			System.out.println(k.getKey()+"   =       "+k.getValue());
		
	}
		}

	
	
	
	
	
	
	
	@Test
	public void fibonacci()
	{
	int a1=0,a2=1,a3, count=10;
		System.out.print(a1+" ");
	for(int i=0;i<count;i++) {
		a3=a1+a2;
		System.out.print(a3+" ");
		a1=a2;
		a2=a3;
	}
		
	}
	
	
	@Test
	public void favctorial() {
		
		int fact=5;
	    int number=1;
		for(int i=1;i<=fact;i++) {
		    number=number*i;
		}
		
		System.out.println(number);
	}

	   @Test
	   public void misiing_number() {
		   int a[]= {1,2,4,6};
		   int length=a.length+2;
		   
		   int total=length*(length+1)/2;
		   int t=0;
		   for(int i=0;i<a.length;i++) {
			   t=t+a[i];
		   }
		   
		   System.out.println(total-t);
		   
		   
	   }
	   
	   @Test
	   public void missing_two_number() {
	   int a[]= {1,2,4,5,7};
	   int l=a.length+2;
	   
	   boolean b[]=new boolean[l];
	   for(int i=0;i<a.length-1;i++) {
		   b[a[i]]=true;
	   }
	   for(int j=1;j<l;j++) {
			 if(!b[j]) {
				 System.out.println(j+" ");
			 }
		 }
		   
		   
	   }
	   
	   @Test
	   public void missing_two_number2() {
		   int b[]= {1,3,5,15};
		   Arrays.sort(b);
		   int l=b[b.length-1]+1;
		  
		   boolean a[]=new boolean[l+1];
		 for(int i=0;i<b.length-1;i++) {
			 a[b[i]]=true;
		 }
		 
		 for(int j=1;j<l;j++) {
			 if(!a[j]) {
				 System.out.println(j+" ");
			 }
		 }
		 
	   }
	   
	   //input value "akash2f2f5f44854855cfd54f1f45f485c18f545df49f"
	   //output value only even number
	   @Test
	   public void even_number() {
		   String a="akash2f2f5f44854855cfd54fgdggffgfbf55454545781f45f485c18f545df49f";
		   
		   HashMap<Integer,Integer>h=new HashMap<Integer, Integer>();
		   for(int i=0;i<a.length()-1;i++) {
			   
			   if(Character.isDigit(a.charAt(i))) {
				  int n=Character.getNumericValue(a.charAt(i));
				  
			      if(n%2==0) {
					  if(h.get(n)==null) {
						  h.put(n, 1);
					  }
					  else {
						  h.put(n, h.get(n)+1);
					  }
				  }
			   }
		   }
		   Iterator<Map.Entry<Integer,Integer>>mm=h.entrySet().iterator();
		   while(mm.hasNext()) {
			   Map.Entry<Integer,Integer>k=mm.next();
			   if(k.getValue()>1) {
				   System.out.println(k.getKey()+" = "+k.getValue()+" times ");
			   }
		   }
		   
	   }
	   
	   
	  @Test 
	   public void swap() {
		   int a=80,b=10;
		   b=a+b;
		   a=b-a;
		   b=b-a;
		   System.out.println("a ="+a+" "+"b ="+b);
	   }
	   
	   @Test
	   public void usingthirdvaribleswap() {
		  
		   int a=80,b=10,c;
		   c=a;
		   a=b;
		   b=c;
		   System.out.println("a ="+a+" "+"b ="+b);
	   }
	   
	   
	   @Test
	   public void palindrome () {
		   
		   int a=454;
		   
		   int b=0;
		   while(a>0) {
			  int r=a%10;
			  b=b*10+r;
			  a=a/10;
		   }
		   System.out.println(b);
		   
	   }
	   
	   
	   
}
