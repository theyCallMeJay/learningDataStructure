package ds.linkedList;

public class App {
	public static void main(String args[]){
		Node nodeA = new Node();
		nodeA.setData(4);
		
		Node nodeB = new Node();
		nodeB.setData(3);
		
		Node nodeC = new Node();
		nodeC.setData(7);
		
		Node nodeD = new Node();
		nodeD.setData(8);
		
		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
		System.out.println(listLength(nodeC));
		System.out.println(listLength(nodeD));
	}
	
	public static int listLength(Node aNode){
		int count = 1;
		while(!(aNode.getNext() == null)){
			count ++;
			aNode = aNode.getNext();
		}
		
		return count;
	}
}
