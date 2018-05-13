package implementationtest;

import static org.junit.Assert.*;

import implementation.Graph;
import implementation.GraphUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

public class GraphsTestSuite {

	Graph graph;
	
	
	
	@Test
	public void readGraph(){
		try{

			int [][] output =  {{0,1,0,0,1}, {1,0,0,0,1}, {0,0,0,0,1}, {0,0,0,0,1}, {1,1,1,1,0}};
            graph = GraphUtils.readGraph("/home/severino/Documents/ufcg/Graphs/GraphsAPI/resources/input.txt");
            Assert.assertArrayEquals(output, graph.getAdjacencyMatrix());
		} catch (Exception e){
			e.printStackTrace();
		}
	}




}
