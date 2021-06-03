package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluriDeTest.StudentDummy;
import ro.ase.cts.dubluriDeTest.StudentStub;

public class GrupaGetPromovabilitate {
	private IStudent studentStub;

	@Before
	public void setUp() throws Exception {
		studentStub = new StudentStub();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitate() {
		Grupa grupa = new Grupa(1010);
		grupa.adaugaStudent(studentStub);
		assertEquals(1.0f, grupa.getPromovabilitate(), 0.0001);
	}
	
}
