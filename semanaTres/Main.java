package semanaTres;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		String archivoEntrada = "stock.txt";
		
		try {
			List<String> lista = Files.readAllLines(Paths.get(archivoEntrada));
			String[] datosProd1 = lista.get(1).split(",");
			String[] datosProd2 = lista.get(2).split(",");
			String[] datosProd3 = lista.get(3).split(",");
			
			Producto producto1 = new Producto (datosProd1[1],datosProd1[2], Float.parseFloat(datosProd1[0]));
			Producto producto2 = new Producto (datosProd2[1],datosProd2[2], Float.parseFloat(datosProd2[0]));
			Producto producto3 = new Producto (datosProd3[1],datosProd3[2], Float.parseFloat(datosProd3[0]));
			
			
			Carrito carrito = new Carrito(producto1, producto2, producto3,LocalDateTime.now());
			
			Persona comprador = new Persona("Macarena", "Reyes", LocalDate.of(1995, 05, 28), carrito);
			
			
			System.out.println("El costo total de su compra es: " + comprador.getCarrito().costoFinal());
			
		}catch(IOException e ) {
			System.out.println("Error de lectura de archivo");
		}
	}

}
