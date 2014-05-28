package edu.esprit.integration.demo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.esprit.interation.demo.managedBeans.CalculatorManagedBean;



public class CalculatorTest {
	
	private CalculatorManagedBean calcul;

	@Before
	public void setUp() throws Exception {
		
		calcul = new CalculatorManagedBean();
	}

	@Test
	public void itShouldReturn1when2entred() {
		assertEquals(1, calcul.process(2));
	}
	
	
	@Test
	public void itShouldReturn2when3entred() {
		assertEquals(2, calcul.process(3));
	}


}
