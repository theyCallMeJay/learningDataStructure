package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.setData(data);
		
		if (isEmpty()) {
			last = newNode;
		}else {
			 first.setPrevious(newNode);
		}
		
		newNode.setNext(first);
		this.first = newNode;
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.setData(data);
		if (isEmpty()) {
			first = newNode;
		}else {
			last.setNext(newNode);
			newNode.setPrevious(last);
		}

		last = newNode;
		
	}
	
	//assume non-empty list
	public Node deleteFirst(){
		Node temp = first;
		
		if (first.getNext() == null) {
			last = null;
		}else {
			first.getNext().setPrevious(null);
		}
		
		first = first.getNext();
		return temp;
	}
	
	public Node deleteLast(){
		Node temp = last;
		
		if (last.getPrevious() == null) {
			first = null;
		}else {
			last.getPrevious().setNext(null);
		}
		
		last = last.getPrevious();
		
		return temp;
	}
	
	//assume a non-empty list
	public boolean insertAfter(int key, int data){
		Node current = first;
		
		while (current.getData() != key) {
			current = current.getNext();
			if (current == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.setData(data);
		
		if (current == last) {
			current.setNext(null);
			last.setNext(newNode);
		}else {
			newNode.setNext(current.getNext());
			current.getNext().setPrevious(newNode);
		}
		
		newNode.setPrevious(current);
		current.setNext(newNode);
		
		return true;
		
	}
	
	
}
