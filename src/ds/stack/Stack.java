package ds.stack;

import java.util.Arrays;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}

	public Stack() {
		// TODO Auto-generated constructor stub
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public char[] getStackArray() {
		return stackArray;
	}

	public void setStackArray(char[] stackArray) {
		this.stackArray = stackArray;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	
	public void push(char j){
		
		if (! isFull()) {
			top++;
			stackArray[top] = j;
		}else {
			System.out.println("You have exceeded the array length limit!");
		}
	}
	
	public char pop(){
		int old_top = top;
		top--;
		return stackArray[old_top];
	}
	
	public long peak(){
		return stackArray[top];
	}

	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (maxSize -1 == top);
	}
	@Override
	public String toString() {
		return "Stack [maxSize=" + maxSize + ", stackArray=" + Arrays.toString(stackArray) + ", top=" + top + "]";
	}
	
}
