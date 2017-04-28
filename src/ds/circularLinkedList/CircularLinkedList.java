package ds.circularLinkedList;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.setData(data);
		
		if (isEmpty()) {
			last = newNode;
		}
		
		
	}
}
