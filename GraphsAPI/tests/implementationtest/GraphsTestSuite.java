package implementationtest;

import static org.junit.Assert.*;

import implementation.Graph;
import implementation.GraphUtils;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

public class GraphsTestSuite {

	Graph graph;
	
	
	
	@Test
	public void readGraph(){
		try{

			graph = GraphUtils.readGraph("/home/severino/Documents/ufcg/Graphs/GraphsAPI/resources/input.txt");

			System.out.println(graph.toString());
		} catch (Exception e){
			e.printStackTrace();
		}
	}




}
