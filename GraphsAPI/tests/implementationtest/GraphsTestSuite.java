package implementationtest;

import static org.junit.Assert.*;

import implementation.Graph;
import implementation.GraphUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;

public class GraphsTestSuite {

	Graph graph;
	
	
	
	@Test
	public void readGraph(){
		try{
			double [][] output =  {{0.0,1.0,0.0,0.0,1.0}, {1.0,0.0,0.0,0.0,1.0}, {0.0,0.0,0.0,0.0,1.0}, {0.0,0.0,0.0,0.0,1.0}, {1.0,1.0,1.0,1.0,0.0}};
            graph = GraphUtils.readGraph("resources/input.txt");
            Assert.assertArrayEquals(output, graph.getAdjacencyMatrix());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void readWeightedGraph() {
		try {
			double [][] output = {
					{0.0, 0.1, 0.0, 0.0, 1.0},
					{0.1, 0.0, 0.0, 0.0, 0.2},
					{0.0, 0.0, 0.0, -9.5, 5.0},
					{0.0, 0.0, -9.5, 0.0, 2.3},
					{1.0, 0.2, 5.0, 2.3, 0.0}
			};
			graph = GraphUtils.readWeightedGraph("resources/inputWithWeight.txt");
            Assert.assertArrayEquals(output, graph.getAdjacencyMatrix());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getEdgeNumber() {
		try {
			double [][] adjacencyMatrix =  {
					//   1  2  3  4  5
					{0.,1.,0.,0.,1.}, //1
					{1.,0.,0.,0.,1.}, //2
					{0.,0.,0.,0.,1.}, //3
					{0.,0.,0.,0.,1.}, //4
					{1.,1.,1.,1.,0.}  //5
					};
			
			double [][] adjacencyMatrixWithLoops =  {
				//   1  2  3  4  5
					{1.,1.,0.,0.,1.}, //1
					{1.,0.,0.,0.,1.}, //2
					{0.,0.,1.,0.,1.}, //3
					{0.,0.,0.,0.,1.}, //4
					{1.,1.,1.,1.,1.}  //5
					};
			
			double [][] adjacencyMatrixWithWeight = {
					{0.0, 0.1, 0.0, 0.0, 1.0},
					{0.1, 0.0, 0.0, 0.0, 0.2},
					{0.0, 0.0, 0.0, -9.5, 5.0},
					{0.0, 0.0, -9.5, 0.0, 2.3},
					{1.0, 0.2, 5.0, 2.3, 0.0}
			};

			Graph graph = new Graph(5);
			
			graph.setAdjacencyMatrix(adjacencyMatrix);
			Assert.assertEquals(GraphUtils.getEdgeNumber(graph), 5);
			
			graph.setAdjacencyMatrix(adjacencyMatrixWithLoops);
			Assert.assertEquals(GraphUtils.getEdgeNumber(graph), 8);
			
			graph.setAdjacencyMatrix(adjacencyMatrixWithWeight);
			Assert.assertEquals(GraphUtils.getEdgeNumber(graph), 6);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void graphRepresentation() {
		try {
			graph = GraphUtils.readGraph("resources/input.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(GraphUtils.graphRepresentation(graph, "AM"));
	}
	
	@Test
	public void getMeanEdge() {
		try {
            
			graph = GraphUtils.readGraph("resources/input.txt");
            
			Assert.assertEquals(2.0, GraphUtils.getMeanEdge(graph), 0.01);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	
	
}