package linkedlist;

public class LinkedList {
	
	// class variables 
	private Node head;
	private Node tail;
	private int length;

	class Node {
		// class variables
		int value;
		Node next; // Variable of type Node, serves as a pointer to a node.  `variable to access the Node type`
		
		// Constructor
		public Node(int value) {
			this.value = value; // keyword `this` for clarification
		}
	}
	
}
