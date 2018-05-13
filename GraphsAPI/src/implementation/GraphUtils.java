package implementation;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * aux entity to work with the graph
 */
public class GraphUtils {


    public static final String DELIMITER = " ";

    public static Graph readGraph(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        String line = br.readLine();
        String[] values = line.trim().split(DELIMITER);
        for(int i=0; i< values.length; i++) {
        	System.out.println(values[i]);
        }
        int v = Integer.parseInt(values[0]);
        Graph graph = new Graph(v);

        while ((line = br.readLine()) != null) {
            values = line.split(DELIMITER);

            int i = Integer.parseInt(values[0]);
            int j = Integer.parseInt(values[1]);
            graph.addEdge(i, j);
            graph.addEdge(j, i);
        }
        br.close();
        return graph;
    }


    public static int getVertexNumber (Graph gragh){

        return gragh.getNumVertices();

    }
    
    public static int getEdgeNumber(Graph graph) {
    	Double links = 0.;
    	Double loops = 0.;
    	int verticesNum = graph.getNumVertices();
    	Double[][] adjacencyMatrix = graph.getAdjacencyMatrix();
    	for(int i = 0; i < verticesNum; i++) {
    		for(int j = 0; j < verticesNum; j++) {
    			if(i == j) {
    				loops += adjacencyMatrix[i][j] != 0.0 ? 1.0 : 0.0;
    			} else {
    				links += adjacencyMatrix[i][j] != 0.0 ? 1.0 : 0.0;
    			}
    		}
    	}
    	Double edgeNumber = links > 0.0 ? ((links / 2) + loops) :  loops;
    	return edgeNumber.intValue();
    }


}
