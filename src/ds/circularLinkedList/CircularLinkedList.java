package ds.circularLinkedList;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	
	public CircularLinkedList() {
		super();
		first = null;
		last = null;
	}


	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.setData(data);
		
		if (isEmpty()) {
			last = newNode;
		}
		
		newNode.setNext(first);
		
		first = newNode;
		
	}


	private boolean isEmpty() {
		return first == null;
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.setData(data);
		
		if (isEmpty()) {
			first = newNode;
		}else {
			last.setNext(newNode);
			last = newNode;
		}
	}
	
	public int deleteFirst(){	
		int temp = first.getData();
		
		if (first.getNext() == null) {
			last = null;
		}
		
		first = first.getNext();
		
		return temp;
	}
	
	public void displayList(){
		System.out.println("List(first --> last)");
		Node current = first;
		while (current != null) {
			System.out.println(current.toString());
			current = current.getNext();
		}
		
		System.out.println();
	}
}
