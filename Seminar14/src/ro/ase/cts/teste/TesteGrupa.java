package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TesteGrupa {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// Right
	@Test
	public void testRight() {
		Grupa grupa = new Grupa(1003);
		assertEquals(1003, grupa.getNrGrupa());
	}

	// Boundary nrGrupa inferior
	@Test
	public void testLimitaInferioaraNrGrupa() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	// Boundary nrGrupa superior
	@Test
	public void testLimitaSuperioaraNrGrupa() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	// Boundary nrGrupa superior
	@Test(expected = IllegalArgumentException.class)
	public void testInAfaraLimiteiSuperioareNrGrupa() {
		Grupa grupa = new Grupa(1300);
	}
	
	//Performance
	@Test(timeout = 1000)
	public void testPerformance() {
		Grupa grupa = new Grupa(1050);
	}
}
