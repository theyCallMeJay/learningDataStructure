package ds.singlyLinkedList;

public class SinglyLinkedList {
	
	private NewNode first;
	private NewNode last
	;

	public SinglyLinkedList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	//used to insert at the beginning of the list
	public void insertFirst(int data){
		NewNode inserted = new NewNode();
		inserted.setData(data);
		inserted.setNext(first);
		first = inserted;
	}
	
	public NewNode deleteFirst(){
		NewNode temp = first;
		first = first.getNext();
		
		return temp;
		
	}
	
	public void insertLast(int data){
		NewNode current = last;
		while(current.getNext() != null){
			current = current.getNext();
		}
		
		NewNode last = new NewNode(data, null);
		
		//NewNode tempLast = current.getNext();
		current.next = last;
		//tempLast = last;
		//current.next = last;
		
		
	}

	public void displayList(){
		System.out.println("Present the list");
		NewNode current = first;
		while(current != null){
			System.out.println(current.toString());
			current = current.getNext();
		}
		
		System.out.println();
		
	}
	
	
	
	
	
}
