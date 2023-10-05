package semanaTres;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	@Test
	void multiplicarTest() {
		//ARRANGE
		double a = 80;
		double b = 3;
		
		//ACT
		double resultado = Calculadora.multiplicacion(a, b);
		
		//ASSERT
		
		assertEquals(resultado, 240.0);
	}

	@Test
	void sumarTest() {
		//ARRANGE
		double a = 150;
		double b = 180;
		double c = 3;
		
		//ACT
		double resultado = Calculadora.division(Calculadora.suma(a, b), c);
		
		//ASSERT
		
		assertEquals(resultado, 110);
	}
	
	@Test
	void restarTest() {
		//ARRANGE
		double a = 90;
		double b = 50;
		double c = 15;
		
		//ACT
		double resultado = Calculadora.multiplicacion(Calculadora.resta(a, b), c);
		
		//ASSERT
		
		assertTrue(resultado != 605);
	}
	
	
	@Test
	void sumarMultiplicarTest() {
		//ARRANGE
		double a = 70;
		double b = 40;
		double c = 25;
		
		//ACT
		double resultado = Calculadora.multiplicacion(Calculadora.suma(a, b), c);
		
		//ASSERT
		
		assertTrue(resultado != 2700);
	}
	

}
