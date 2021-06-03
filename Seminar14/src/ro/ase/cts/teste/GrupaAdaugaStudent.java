package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluriDeTest.StudentDummy;
import ro.ase.cts.dubluriDeTest.StudentStub;

public class GrupaAdaugaStudent {

	private IStudent studentDummy;

	@Before
	public void setUp() throws Exception {
		studentDummy = new StudentDummy();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdaugaStudent() {
		Grupa grupa = new Grupa(1003);
		grupa.adaugaStudent(studentDummy);

		assertEquals(1, grupa.getListaStudenti().size());
	}

	@Test
	public void testAdaugaStudentCardinality() {
		Grupa grupa = new Grupa(1003);
		IStudent studentDummy2 = new StudentDummy();
		IStudent studentDummy3 = new StudentDummy();
		grupa.adaugaStudent(studentDummy);
		grupa.adaugaStudent(studentDummy2);
		grupa.adaugaStudent(studentDummy3);

		assertEquals(3, grupa.getListaStudenti().size());
	}
}