package dk.eaaa.bm.simulatedannaling;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import dk.eaaa.bm.optimization.simulatedannealing.SimpleSimulatedAnnealingMax;

@RunWith(JUnit4.class)
public class SimpleSimulatedAnnealingMaxTests {
	
//	private final static double coolingRate = 0.004;
//	private static double temperature = 100000;

	@Test
	public void aTest() {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(12.3);
		list.add(1.45);
		list.add(0.34);
		list.add(65.65);
		list.add(8.3);
		list.add(5.45);
		list.add(34.34);
		list.add(1023.65);

		SimpleSimulatedAnnealingMax test = new SimpleSimulatedAnnealingMax(list);
		
		System.out.println(test.findOptima(0.004, 100000.0));
		System.out.println(test.findOptima(0.001, 100000.0));
		System.out.println(test.findOptima(0.001, 10000.0));
		System.out.println(test.findOptima(0.001, 1000.0));
		
		System.out.println(test.findOptima(0.01, 1000.0));
		
//		System.out.println(test.findOptima(0.004, 100000.0));
//		System.out.println(test.findOptima(0.004, 100000.0));
//		System.out.println(test.findOptima(0.004, 100000.0));
		

	}
}
