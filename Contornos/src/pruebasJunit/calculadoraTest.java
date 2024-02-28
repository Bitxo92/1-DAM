package pruebasJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	void testSumar() {
		// fail("Not yet implemented");
		calculadora calc = new calculadora(2, 4);
		float esperado = 6;
		float resul = calc.sumar();
		assertEquals(esperado, resul);
	}

	@Test
	void testRestar() {
		// fail("Not yet implemented");
		calculadora calc = new calculadora(2, 4);
		float esperado = 2;
		float resul = calc.restar();
		assertEquals(esperado, resul);
	}

	@Test
	void testDividir() {
		// fail("Not yet implemented");
		calculadora calc = new calculadora(2, 4);
		float esperado = 0.5f;
		float resul = calc.dividir();
		assertEquals(esperado, resul);
	}

	@Test
	void testMultiplicar() {
		// fail("Not yet implemented");
		calculadora calc = new calculadora(2, 4);
		float esperado = 8;
		float resul = calc.multiplicar();
		assertEquals(esperado, resul);
	}

}
