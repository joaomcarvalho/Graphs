package implementation;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class GraphAlgorithms {
	
	private Graph graph;
	
	public GraphAlgorithms (int v) {
		this.graph = new Graph(v);
		
	}

	public void BFS(int v) {
	    boolean visited[] = new boolean[graph.getAdjacencyMatrix().length];
	    LinkedList<Integer> queue = new LinkedList<Integer>();
	    visited[v-1] = true;
	    queue.add(v);
	    while(queue.size()!=0) {
	        int x = queue.remove();
	        System.out.print(x + " ");
	        for (int i=1; i <= graph.getAdjacencyMatrix().length; i++) 
	            if((graph.getAdjacencyMatrix()[x][i] == 1 && (!visited[i]))){
	              queue.add(i);
	              visited[i] = true;
	             }
	     }	
	}
	
	public Graph getGraph() {
		return this.graph;
	}
	
}
