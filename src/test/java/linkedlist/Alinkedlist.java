package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Alinkedlist<E> {

	
	  Node head; //	head node form the list
	
	
	
	
	
	class Node{
		E data; // to store data 
		Node next; //to point to next node 
		
		
		Node(E data){ //to intialize the data
			this.data=data;
		}
		
		
	}
	
	
	
	
	
	    public void add(Alinkedlist<E> list,E data) {
			
	    	Node new_node= new Node(data);
	    	
			
			//1-> 2-> null 
			//if the linked list is empty,
			//then make the new node as head
			if(list.head==null) {
				list.head=new_node;
			}
			else {
 
				//Else traverse till the last node 
                //and insert the new_node there				
				Node last=list.head;
				while(last.next != null) {
					last=last.next;
				}
				last.next=new_node;
			}
	    	
		
	}
	    
	    
	    
	    public void printlist(Alinkedlist<E> list) {
	    	Node current=list.head;
	    	
	    	
	    	// traverse through the linkedlist 
	    	while(current != null) {
	    		System.out.println(current.data+" ");
	    		
	    		//go to next node 
	    		current=current.next;
	    	}
	    	
	    	
	    }
	
	    
	    public void remove(Alinkedlist<E> list ,E data) {
	    	
	    	
	    }
	    
	    
	    public void removeDuplicateNodes() {  
	        //Head is the current node  
	        Node current = head, index = null, temp = null;  
	        //head = null means list is empty
	        if(head == null) {  
	            return;  
	        }  
	        //traverse through the list
	        else {  
	            while(current != null){  
	                //temp node points to previous node to index.  
	                temp = current;  
	                //Index will point to node next to current  
	                index = current.next;  
	                  while(index != null) {  
	                    //Check if current node's data is equal to index node's data  
	                    if(current.data == index.data) {  
	                        //since node is duplicate skip index and point to next node 
	                        temp.next = index.next;  
	                    }  
	                    else {  
	                        //Temp will point to previous node of index.  
	                        temp = index;  
	                    }  
	                    index = index.next;  
	                }  
	                current = current.next;  
	            }  
	        }  
	    }  
	    
	    public static void main(String[] args) {
			Alinkedlist<Integer> a= new Alinkedlist<Integer>();
			a.add(a,1);
			a.add(a, 2);
			a.add(a, 3);
			a.add(a, 3);
			a.add(a, 4);
			a.removeDuplicateNodes();
			a.printlist(a);
			
	
			
		}
	    
	    
	    
	    
}
