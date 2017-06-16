package ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private int vCount;
	private int eCount;
	private ArrayList<Integer>[] arrayList;
	
	public Graph(int vCount) {
		super();
		this.vCount = vCount;
		this.eCount = 0;
		this.arrayList = new ArrayList[vCount];
		
		for (int i = 0; i < vCount; i++) {
			arrayList[i] = new ArrayList<>();
		}
	}
	public int getvCount() {
		return vCount;
	}
	public void setvCount(int vCount) {
		this.vCount = vCount;
	}
	public int geteCount() {
		return eCount;
	}
	public void seteCount(int eCount) {
		this.eCount = eCount;
	}
	public ArrayList<Integer>[] getArrayList() {
		return arrayList;
	}
	public void setArrayList(ArrayList<Integer>[] arrayList) {
		this.arrayList = arrayList;
	}
	
	public void addEdge(int src, int des){
		arrayList[src].add(des);
		eCount ++;
	}
	
	public ArrayList<Integer> showEdges(int src){
		return arrayList[src];
	}
	
	
	
}
