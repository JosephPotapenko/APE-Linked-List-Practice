

import javax.imageio.IIOException;

/*
 * Write the code for the stubbed out addAtIndex method at the
 * bottom of this class.
 * 
 * If the index passed in is less than 0 or strictly greater
 * than the size, throw an IllegalArgumentException with the message:
 * 
 * "index to addAtIndex was " + index + ", it should be from 0 to " + this.size
 * 
 * If the data passed in is null, throw an IllegalArgumentException that says:
 * 
 * "data passed to addAtIndex was null"
 * 
 * Otherwise, add the data at the index specified.
 */

//LinkedList with no dummy node (head points at first node in list)
public class LinkedList {
	private Node head;
	private int size;

	//nested Node class
	private class Node {
		private Object data;
		private Node next;

		private Node() {
			this(null, null);

		}// end default Node constructor

		private Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}// end parameterized Node constructor


	}//end nested class Node


	public LinkedList() {

		this.head = null;
		this.size = 0;

	}// end default LinkedList constructor

	public int size() {
		return this.size;
	}// end size method

	@Override
	public String toString() {

		String result = "";

		result += "List size is: " + this.size + "\r\n";

		for (Node cur = this.head; cur != null; cur = cur.next) {
			result += cur.data + "\r\n";
		}//end for

		return result;

	}// end toString method

	public void addFirst(Object data) {

		this.head = new Node(data, this.head);
		this.size++;

	}// end addFirst

	public void addAtIndex(int index, Object data) {
		if ((index < 0) || (index > this.size))
			throw new IllegalArgumentException("index to addAtIndex was " + index + ", it should be from 0 to " + this.size);
		if (index == 0)
			addFirst(data);
		int counter = 0;
		Node nn = new Node(data, null);
		Node cur = this.head;
		Node prev = null;
		while ((cur != null) && (counter < index)) {
			prev = cur;
			cur = cur.next;
			counter++;
		}
		prev.next = nn;
		nn.next = cur;
	}

}


