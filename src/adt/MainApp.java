package adt;

import java.util.LinkedList;

public class MainApp {
	public static void main(String agrs[]){
		Counter counter = new Counter();
		counter.increment();
		System.out.println(counter.getI());
		counter.increment();
		counter.increment();
		counter.increment();
		
		System.out.println(counter.toString());
		
		LinkedList myList = new LinkedList();
	}
}
