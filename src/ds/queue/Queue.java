package ds.queue;

public class Queue {
	
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	public Queue(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long j){
		rear++;
		queArray[rear] = j;
		nItems ++;
	}
	
	public void view(){
		System.out.println("[");
		for (int i = 0; i < queArray.length; i++) {
			System.out.println(queArray[i] + " ");
		}
		
		System.out.println("]");
	}
	
	public long remove(){
		long temp = queArray[front];
		front ++;
		
		if (front == maxSize) {
			front = 0;
		}
		
		nItems --;
		
		return temp;
	}
	
	public long peekFront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems == 0);
	}
	
	public boolean isFull(){
		return (nItems == maxSize);
	}
	
	
}
