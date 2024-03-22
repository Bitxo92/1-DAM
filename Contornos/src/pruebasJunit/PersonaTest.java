package pruebasJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEdad() {
		//fail("Not yet implemented");
		Persona p1 = new Persona("juan",23);
		assertEquals("juan",p1.getEdad());
	}

	@Test
	void testSetEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testPersona() {
		fail("Not yet implemented");
	}

	@Test
	void testEsMayordeEdad() {
		//fail("Not yet implemented");
		Persona p1 = new Persona("Es mayor",50);
		Persona p2 = new Persona("Es menor", 5);
		
		assertTrue(p1.esMayordeEdad(p1.getEdad()));
		assertFalse(p2.esMayordeEdad(p2.getEdad()));
	}

}
