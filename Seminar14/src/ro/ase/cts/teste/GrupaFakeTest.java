package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.categorii.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluriDeTest.StudentFake;

public class GrupaFakeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Category({TesteNormale.class, TesteGetPromovabilitate.class})
	public void testGetPromovabilitateFaraRestante() {
		IStudent studentFake = new StudentFake();
		((StudentFake)studentFake).setAreRestante(false);
		Grupa grupa = new Grupa(1002);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(1.0f, grupa.getPromovabilitate(), 0.001);
	}
	
	@Test
	@Category({TesteUrgente.class, TesteGetPromovabilitate.class})
	public void testGetPromovabilitateCuRestante() {
		IStudent studentFake = new StudentFake();
		((StudentFake)studentFake).setAreRestante(true);
		Grupa grupa = new Grupa(1002);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}

}
