package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorRightNume() {
		String nume = "Iulian";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}

	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}

	@Test
	public void testListSize() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}

	@Test
	public void testCalculeazaMedieOSinguraNota() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testCalculeazaMedieMaiMulteNote() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 9;
		int nota3 = 5;

		float medie = (nota1 + nota2 + nota3) / 3.0f;

		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testCalculeazaMedieFaraNoteAdaugate() {
		Student student = new Student();

		assertEquals(0, student.calculeazaMedie(), 0.01);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNota() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(-1));
	}

//	@Test()
//	public void testGetNotaJUNit5() {
//		Student student = new Student();
//		int nota = 8;
//		student.adaugaNota(nota);
//		assertThrows(IndexOutOfBoundsException.class, () -> student.getNota(-1));
//	}

	@Test()
	public void testGetNotaJUNit3() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		try {
			int x = student.getNota(-1);
			fail("IndexOutOfBoundsException"); // aici nu ajunge pentru ca arunca exceptia la student.getNota(-1) si trebuie sa pice testu acolo
		} catch (IndexOutOfBoundsException e) {

		}
	}
	
	@Test()
	public void testAreRestante() {
		Student student = new Student();
		int nota = 8;
		int nota1 = 4;
		student.adaugaNota(nota);
		student.adaugaNota(nota1);
		
		assertTrue(student.areRestante());
	}
	
	@Test()
	public void testAreRestanteFalse() {
		Student student = new Student();
		int nota = 8;
		int nota1 = 5;
		int nota2 = 6;
		student.adaugaNota(nota);
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		
		assertFalse(student.areRestante());
	}

}
