package ArrayList_Custome;

import java.util.ArrayList;

public class CheckcustomArray {


    public static void main(String[] args) {
		
    	CArray_List<Integer> a=new CArray_List<>();
		/*
		 * a.add(1); a.add(20); a.add(30); a.add(30); a.remove(30);
		 */
    	a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(6);
        a.remove(6);
        a.add(6);
        a.remove(6);
    	a.display();

    ArrayList<String> b=new ArrayList<>();
     b.add("A");
     b.add("B");
     b.add("C");
     b.add("D");
     b.add("E");
     b.add("G");
     b.add("G");
     b.remove("G");
     b.add("G");
     b.remove("G");
    	
      System.out.println(b);
	}

}
