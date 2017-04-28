package ds.singlyLinkedList;

public class NewNode {
	private int data;
	public NewNode next;
	
	
	
	public NewNode(int data, NewNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	
	public NewNode() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public NewNode getNext() {
		return next;
	}
	public void setNext(NewNode next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "NewNode [data=" + data + ", next=" + next + "]";
	}
	
	
	
}
