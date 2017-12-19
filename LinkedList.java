/**
 * This class implements a singly linked list data structure.
 * 
 * @author Michael Ida
 *
 */
public class LinkedList {
	
	private Node head;
	private Node tail;
	
	/*
	 * The constructor creates an empty list.
	 */
	public LinkedList() {
		head = null;
		tail = null;
	}
	
	/*
	 * This method creates a new node and adds it to the head of the list.
	 */
	public void insertFirst(String data) {
		Node newNode = new Node();
		newNode.record = data;
		if (head == null) {
			head = newNode;
		} else {
		newNode.next = head;
		head = newNode;
	}
	}
	
	/*
	 * This method deletes the first node in the list.
	 */
	public void deleteFirst() {
		if (head == null) {
            return;
		} else {
			head = head.next;
		}
	}
	
	/*
	 * This method should create a new node containing data and add it following the node 'after'.
	 * If after is null, then it should do nothing.
	 */
	public void insertAfter(String data, Node after) {
		if (head == null) {
			return;
		} else if (after == null) {
			return;
		} else {
		Node pointer = head;
		Node newNode = new Node();
		newNode.record = data;
		newNode.next = after.next;
		after.next = newNode;
			
		}
	}
	
	/*
	 * This method should find the node containing the string data and return a pointer to that node.
	 * If not found, then it should return null.
	 */
	public Node findNode(String data) {
		Node pointer = head;
		while(pointer != null) {
			if (pointer.record.equals(data)) {
				return pointer;
			} else {
				pointer = pointer.next;
			}
		}
		return null;
	}
	
	/*
	 * This method should delete the node trash.
	 * If trash is null, then it does nothing.
	 */
	public void deleteNode(Node trash) {
		Node pointer = head;
		if (head == null) {
			return;
		} else if (trash == null) {
			return;
		} else {
			while (pointer != null) {
				if (pointer == trash) {
					pointer = null;
				} else {
					pointer = pointer.next;
				}
			}
		}
		
	}
	
	/*
	 * This method should create a new node and insert it at the end of the list.
	 */
	public void insertLast(String data) {
		
		Node a = new Node();
		a.record = data;
		Node pointer = head;
		if (head == null) {
			head = a;
		} else {
		a.next = null;
		while (pointer.next != null) {
			pointer = pointer.next;
		}
		pointer.next = a;
		}
	}
	
	/*
	 * This method deletes the last node in the list.
	 * If the list is empty, then it does nothing.
	 */
	public void deleteLast() {
		 if (head == null)
             return;
       else {
                   Node pointer = head;
                   while (pointer.next != null) {
                        pointer = pointer.next;
                   }
                   tail = pointer;
                   tail.next = null;
             }
       }

	
	/*
	 * This method transverses the list and prints out the record in each node.
	 */
	public void traverseAndPrint() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println("");
	}
	
}