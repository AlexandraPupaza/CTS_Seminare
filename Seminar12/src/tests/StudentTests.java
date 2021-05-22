package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testCorectitudineConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		assertEquals(nume,student.getNume());
	}
	
	@Test
	public void testInitializareListaInConstructorCuParametru() {
		Student student = new Student("Gigel");
		//assertNotEquals(null,student.getNote());
		assertNotNull(student.getNote());
	}
	@Test
	public void testCorectitudineConstructorDefault() {
		Student student = new Student();
		assertNotNull("Numele nu a fost initializat", student.getNume());
		assertNotNull("Lista nu a fost initializata", student.getNote());
	}
	
	@Test
	public void testMetodaAdaugareNotaInLista() {
		Student student = new Student();
		int nota =10;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}

}
