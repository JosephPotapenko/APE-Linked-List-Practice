

import java.util.List;

/*
 * Write the code for the stubbed out addLast method at the bottom of the class.
 * 
 * The method will take a List (which is an interface specified in the Java API --
 * see the API for the methods provided by a List and utilize them as necessary to
 * traverse it).
 * 
 * If the List passed in is null, throw and IllegalArgumentException that says:
 * 
 * list parameter null on call to addLast
 * 
 * If the passed in List is empty, you can leave the existing list as it is, since there
 * is nothing to add.
 * 
 * The method adds the contents of the List to the end of the existing LinkedList
 * such that each data item in the List is added as a Node to the existing LinkedList.
 * The data in the List should be added in the order it occurs (from the start of the List).
 * 
 * Update all fields in the current LinkedListDummy class as necessary.
 *
 */
//Singly linked list with a dummy/buffer node that head always points at.
public class LinkedListDummy {
	//nested Node class
		private class Node{
		private Node head;
		private int size;
			private Object data;
			private Node next;
			
			private Node(){
				this(null, null);
				
			}// end default Node constructor
			
			private Node(Object data, Node next){
				this.data = data;
				this.next = next;
			}// end parameterized Node constructor
			
					
		}//end nested class Node

		
		public LinkedListDummy(){
			
			this.head = new Node(null, null);
			this.size = 0;
			
		}// end default LinkedList constructor
		
		public int size(){
			return this.size;
		}// end size method
		
		@Override
		public String toString(){
			
			String result = "";
			
			result += "List size is: " + this.size + "\r\n";
			
			for (Node cur = this.head.next; cur != null; cur = cur.next){
				result += cur.data + "\r\n";
			}//end for
			
			return result;
			
		}// end toString method
		
		public void addFirst(Object data){
			
			this.head.next = new Node(data, this.head.next);
			this.size++;
			
		}// end addFirst
		
		public void addLast(List aList) {
			if(aList == null)
				throw new IllegalArgumentException ("list parameter null on call to addLast");


		}

}

