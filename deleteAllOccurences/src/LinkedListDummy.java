
/*
 * Write the code for the stubbed out deleteAllOccurrences method at the bottom
 * of this class.
 * 
 * If the data passed in is null, throw an IllegalArgumentException that says:
 * 
 * data passed to deleteAllOccurrences was null
 * 
 * The method should delete all occurrences of the data passed in.
 * The method should update fields of the LinkedListDummy class as necessary.
 * The method returns a count of the number of items deleted.
 */

//Singly linked list with a dummy/buffer node that head always points at.
public class LinkedListDummy {
	//nested Node class
		private class Node{
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
		
		private Node head;
		private int size;
		
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
		
		public int deleteAllOccurrences(Object data){
			

			//your code goes here!
			
			
			
			return 0; //placed here so code compiles
		}//end deleteAllOccurrences
		

}

