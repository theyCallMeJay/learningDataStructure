package ds.graph;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Graph myGraph = new Graph(5);
		myGraph.addEdge(0, 1);
		myGraph.addEdge(0, 2);
		myGraph.addEdge(0, 3);
		myGraph.addEdge(1, 2);
		myGraph.addEdge(1, 4);
		myGraph.addEdge(2, 3);
		myGraph.addEdge(3, 1);
		myGraph.addEdge(4, 0);
		myGraph.addEdge(4, 3);
		
		ArrayList<Integer> edges = myGraph.showEdges(4);
		for (Integer integer : edges) {
			System.out.println(integer + "\n");
		}
		
		System.out.println(myGraph.geteCount());
	}

}
