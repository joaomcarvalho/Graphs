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
        int v = Integer.parseInt(values[0]);
        Graph graph = new Graph(v);

        while ((line = br.readLine()) != null) {
            values = line.split(DELIMITER);

            int i = Integer.parseInt(values[0]);
            int j = Integer.parseInt(values[1]);
            graph.addEdge(i, j);
            graph.addEdge(j, i);
        }
        return graph;
    }


    public static int getVertexNumber (Graph gragh){

        return gragh.getNumVertices();

    }


}
