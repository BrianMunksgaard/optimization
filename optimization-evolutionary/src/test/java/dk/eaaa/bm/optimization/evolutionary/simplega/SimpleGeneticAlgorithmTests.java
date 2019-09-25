package dk.eaaa.bm.optimization.evolutionary.simplega;

import org.junit.Test;

public class SimpleGeneticAlgorithmTests {

	@Test
	public void runAlgo() {
		SimpleGeneticAlgorithm ga = new SimpleGeneticAlgorithm();
		ga.runAlgorithm(50, "1011000100000100010000100000100111001000000100000100000000001111");
	}
}
