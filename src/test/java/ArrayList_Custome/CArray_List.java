package ArrayList_Custome;

public class CArray_List<E>{

	
	
	private static final int Initial_capcity=10;
	private int size=0;
	private Object elementdata[]= {};
	
	
	
	public CArray_List(){
		elementdata=new Object[Initial_capcity];
	}
	
	
	
	
	
	public void add(E e) {
		elementdata[size]=e;
		size++;
		if(size==elementdata.length) {
			Object newelement[]= new Object[elementdata.length*2];
			for(int i=0;i<elementdata.length;i++) {
				newelement[i]=elementdata[i];
			}
			elementdata=newelement;
		}
		
		
	}
	
	
      public void remove(int index) {
         for(int i=index;i<size-1;i++) {
        	 elementdata[i]=elementdata[i+1];
         }
         size--;
	  }
	
      public void remove(Object o) {
    	  int i1=0;
    	  boolean fa=false;
    	  while(!fa) {
    	  while(o==elementdata[i1]) {
          for(int i=i1;i<size-1;i++) {
         	 elementdata[i]=elementdata[i+1];
             }
             size--;
             fa=true;
             break;
    	    }
    	   i1++;
    	  }
 	  }
	
	 public void display() {
         for (int i = 0; i < size; i++) {
                System.out.print(elementdata[i] + " ");
         }
  }
	 
	 
	 public int getSize() {
		return size;
	}
	 

}
