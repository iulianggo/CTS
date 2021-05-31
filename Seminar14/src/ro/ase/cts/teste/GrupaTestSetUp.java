package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaTestSetUp {
	private Grupa grupa;

	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1005);
		for(int i = 0 ; i < 35 ; i++) {
			Student student = new Student();
			student.adaugaNota(i % 10 + 1);
			grupa.adaugaStudent(student);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

//Teste getPromovabilitate
	
//	Right
	@Test()
	public void testRightPromovabilitate() {
		Grupa grupa = new Grupa(1005);
		for(int i = 0 ; i < 10 ; i++) {
			Student student = new Student();
			student.adaugaNota(i + 1);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.6f, grupa.getPromovabilitate(), 0.01f);
	}
	
	//Boundary
	@Test()
	public void testLimitaInferioaraPromovabilitate() {
		Grupa grupa = new Grupa(1005);
		for(int i = 0 ; i < 10 ; i++) {
			Student student = new Student();
			student.adaugaNota(1);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.0f, grupa.getPromovabilitate(), 0.01f);
	}
	
	@Test()
	public void testLimitaSuperioaraPromovabilitate() {
		Grupa grupa = new Grupa(1005);
		for(int i = 0 ; i < 10 ; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1.0f, grupa.getPromovabilitate(), 0.01f);
	}
	
	@Test()
	public void testBoundaryPromovabilitate() {
		Grupa grupa = new Grupa(1005);
		assertEquals(0, grupa.getPromovabilitate(), 0.0001f);
	}
	
	@Test(timeout = 100)
	public void testPerformancePromovabilitate() {
		grupa.getPromovabilitate();
	}
	
	@Test()
	public void testCardinalityPromovabilitate() {
		Grupa grupa = new Grupa(1005);
		Student student = new Student();
		student.adaugaNota(5);
		grupa.adaugaStudent(student);
		assertEquals(1.0f, grupa.getPromovabilitate(), 0.0001f);
	}
}
