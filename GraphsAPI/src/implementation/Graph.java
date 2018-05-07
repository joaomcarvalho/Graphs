package implementation;

public class Graph {
	
	private int[][] adjacencyMatrix;
	private int numVertices;
	
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

	
}
