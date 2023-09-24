package ArrayList_Custome;

public class Clinked_list<E> {

	     Node head;
	
	
	
	     class Node{
		    E data;
		    Node next;
		      Node(E data){
			  this.data=data;
		 }
		
	}
	
	
	     
	     
	     public void add(Clinked_list<E> list,E data) {
	    	 
	    	 Node new_code=new Node(data);
	    	 
	    	 if(list.head==null) {
	    		 list.head=new_code;
	    	 }else {
	    		 
	    		 Node last=list.head;
	    		 while(last.next!=null) {
	    			 last=last.next;
	    		 }
	    		 
	    		 last.next=new_code;
	    	 }
	    	 
	    	 
	    	 
	    	 
	     }
	
	
}
