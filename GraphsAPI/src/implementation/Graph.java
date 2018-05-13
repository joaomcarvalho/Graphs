package implementation;

import java.util.LinkedList;

/**
 * This graph's representation take into account the follows rules:
 * 1- A[i][j] = 1, means that has an edge between i and j,
 * 2- A[i][i] = 1, means that has a loop in vertice i
 * 3 - To representate the weight of edges => A[i][j] = weight
 */
public class Graph {
	
	private int[][] adjacencyMatrix;
	private int numVertices;
	private static final int DEFAULT_WEIGHT = 1;
	
	public Graph(int v) {
		this.numVertices = v;
		this.adjacencyMatrix = new int[numVertices][numVertices];
	}

	public int[][] getAdjacencyMatrix() {
		return adjacencyMatrix;
	}

	public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
		this.adjacencyMatrix = adjacencyMatrix;
	}

	public int getNumVertices() {
		return numVertices;
	}

	public void setNumVertices(int numVertices) {
		this.numVertices = numVertices;
	}

	public void addEdge(int i, int j){
	    this.adjacencyMatrix[i-1][j-1] = DEFAULT_WEIGHT;
    }


    public void removeEdge(int i, int j) {
        this.adjacencyMatrix[i-1][j-1] = 0;
    }

    public boolean hasEdge(int i, int j) {
	    return this.adjacencyMatrix[i][j] >= DEFAULT_WEIGHT;
    }
     

	public void BFS(int v) {
	    boolean visited[] = new boolean[adjacencyMatrix.length];
	    LinkedList<Integer> queue = new LinkedList<Integer>();
	    visited[v-1] = true;
	    queue.add(v);
	    while(queue.size()!=0) {
	        int x = queue.remove();
	        System.out.print(x + " ");
	        for (int i=1; i <= adjacencyMatrix.length; i++) 
	            if((adjacencyMatrix[x][i] == 1 && (!visited[i]))){
	              queue.add(i);
	              visited[i] = true;
	             }
	     }	
	}

    public String toString(){
		String out = "";

		for(int i = 0; i < adjacencyMatrix.length; i++){
			out += lineToString(adjacencyMatrix[i]);
			out += "\n";
		}
		return out;
	}

	private String lineToString(int[] line) {

		String out = "";
		for(int i = 0; i < line.length; i++){
			out += line[i];
			out += "\t";
		}
		return out;

	}
	
}
