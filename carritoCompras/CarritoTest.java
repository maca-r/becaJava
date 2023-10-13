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
		//Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		Carrito compra = new Carrito(LocalDateTime.now());
		compra.addProducto(jabon);
		compra.addProducto(shampoo);
		compra.addProducto(esponja);
		
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
		//Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		Carrito compra = new Carrito(LocalDateTime.now());
		compra.addProducto(jabon);
		compra.addProducto(shampoo);
		compra.addProducto(esponja);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		
		//ASSERT
		assertTrue(costoTest != 0);
	}

	
	@Test
	void precioDescuentoFijoTest() throws Exception {
		try {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		//Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		Carrito compra = new Carrito(LocalDateTime.now());
		compra.addProducto(jabon);
		compra.addProducto(shampoo);
		compra.addProducto(esponja);
		DescuentoFijo descuento = new DescuentoFijo(150);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		float precioConDescuento = descuento.descontar(costoTest);
		
		//ASSERT
		assertEquals((costoTest - 150 ), precioConDescuento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void precioDescuentoPorcentajeTest() throws Exception {
		try {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		//Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		
		Carrito compra = new Carrito(LocalDateTime.now());
		compra.addProducto(jabon);
		compra.addProducto(shampoo);
		compra.addProducto(esponja);
		DescuentoPorcentaje descuento = new DescuentoPorcentaje((float) 0.7);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		float precioConDescuento = descuento.descontar(costoTest);
		
		//ASSERT
		assertEquals((costoTest * 0.7), precioConDescuento);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void precioDescuentoPorcentajeConTopeTest() throws Exception {
		try{
			//ACT
		
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		//Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		Carrito compra = new Carrito(LocalDateTime.now());
		compra.addProducto(jabon);
		compra.addProducto(shampoo);
		compra.addProducto(esponja);
		
		DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope((float) 0.85);
		descuento.setTope(1);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		float precioConDescuento = descuento.descontar(costoTest);
		
		//ASSERT
		assertEquals((costoTest * 0.85 ), precioConDescuento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void precioDescuentoPorcentajeConTopeTest1() throws Exception {
		try {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 750);
		Producto shampoo = new Producto("brillo", "S50", 970);
		Producto esponja = new Producto("limpia", "A70", 560);
		//Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
		Carrito compra = new Carrito(LocalDateTime.now());
		compra.addProducto(jabon);
		compra.addProducto(shampoo);
		compra.addProducto(esponja);
		
		DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope((float) 1);
		descuento.setTope(1);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
		
		
		float precioConDescuento = descuento.descontar(costoTest);
		
		
		//ASSERT
		assertTrue(costoTest == precioConDescuento);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void descuentoExcepcionTest() throws Exception {
		//ACT
				Producto jabon = new Producto("liquido", "D90", 0);
				Producto shampoo = new Producto("brillo", "S50", 0);
				Producto esponja = new Producto("limpia", "A70", 0);
				//Carrito compra = new Carrito(jabon, shampoo, esponja, LocalDateTime.now());
				Carrito compra = new Carrito(LocalDateTime.now());
				compra.addProducto(jabon);
				compra.addProducto(shampoo);
				compra.addProducto(esponja);
				DescuentoFijo descuento = new DescuentoFijo(150);
				
				//ARRANGE
				float costoTest = compra.costoFinal();
				
				
				//ASSERT
				assertThrows(Exception.class, () -> descuento.descontar(costoTest));
	} 
	
	
	@Test
	void descuentoExcepcionTest1() throws Exception {
		//ACT
		Producto jabon = new Producto("liquido", "D90", 500);
		Producto shampoo = new Producto("brillo", "S50", 1070);
		Producto esponja = new Producto("limpia", "A70", 560);
	
		Carrito compra = new Carrito(LocalDateTime.now());
		compra.addProducto(jabon);
		compra.addProducto(shampoo);
		compra.addProducto(esponja);
		
		DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope((float) 2);
		descuento.setTope(1);
		
		//ARRANGE
		float costoTest = compra.costoFinal();
				
		//ASSERT
		assertThrows(Exception.class, () -> {descuento.descontar(costoTest);});
	}
}
