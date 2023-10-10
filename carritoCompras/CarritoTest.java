package semanaTres;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class CarritoTest {

	@Test
	void precioTest() {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		
		//ASSERT
		
		assertEquals(2280, costoTest);
	}
	
	@Test
	void precioTest1() {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		
		//ASSERT
		assertTrue(costoTest != 0);
	}

	
	@Test
	void precioDescuentoFijoTest() {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		DescuentoFijo descuento = new DescuentoFijo(150);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		float precioConDescuento = descuento.descontar(costoTest);
		
		//ASSERT
		assertEquals((costoTest - 150 ), precioConDescuento);
	}
	
	@Test
	void precioDescuentoPorcentajeTest() {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		DescuentoPorcentaje descuento = new DescuentoPorcentaje((float) 0.7);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		float precioConDescuento = descuento.descontar(costoTest);
		
		//ASSERT
		assertEquals((costoTest * 0.7), precioConDescuento);
	}
	
	@Test
	void precioDescuentoPorcentajeConTopeTest() {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope((float) 0.85);
		descuento.setTope(1);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		float precioConDescuento = descuento.descontar(costoTest);
		
		
		
		//ASSERT
		assertEquals((costoTest * 0.85 ), precioConDescuento);
	}
	
	@Test
	void precioDescuentoPorcentajeConTopeTest1() {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope((float) 2);
		descuento.setTope(1);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		float precioConDescuento = descuento.descontar(costoTest);
		
		
		
		//ASSERT
		assertTrue(costoTest == precioConDescuento);
	}
}
