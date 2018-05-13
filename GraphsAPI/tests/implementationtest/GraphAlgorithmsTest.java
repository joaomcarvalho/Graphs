package implementationtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import implementation.GraphAlgorithms;

class GraphAlgorithmsTest {

	private GraphAlgorithms graphA =  new GraphAlgorithms("/home/joao/Documentos/ATG/GraphsAPI/resources/input.txt");
	
	@Test
	void test() {
		for(int i = 0; i < 5; i ++) {
			String line = "";
			for (int j = 0; j < 5;j++) {
				line += graphA.getGraph().getAdjacencyMatrix()[i][j];
			}
			System.out.println(line);
		}
	}

}
