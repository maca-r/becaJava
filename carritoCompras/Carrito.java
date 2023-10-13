package semanaTres;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	//private Producto prod1;
	
	//private Producto prod2;
	
	//private Producto prod3;
	
	private List<Producto> productos;
	
	private LocalDateTime fechaCompra;
	
	public Carrito(LocalDateTime fechaCompra) {
		this.productos = new ArrayList<Producto>();
		this.fechaCompra = fechaCompra;
	}
	
	/*public Carrito(Producto prod1,Producto prod2,Producto prod3,LocalDateTime fechaCompra) {
		this.prod1 = prod1;
		this.prod2 = prod2;
		this.prod3 = prod3;
		this.fechaCompra = fechaCompra;
	}
	
	

	public Producto getProd1() {
		return prod1;
	}

	public void setProd1(Producto prod1) {
		this.prod1 = prod1;
	}

	public Producto getProd2() {
		return prod2;
	}

	public void setProd2(Producto prod2) {
		this.prod2 = prod2;
	}

	public Producto getProd3() {
		return prod3;
	}

	public void setProd3(Producto prod3) {
		this.prod3 = prod3;
	}*/

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	
	public float costoFinal() {
		float costo = 0;
		
		for (Producto producto : productos) {
			costo = costo + producto.costoFinal();
		}
		
		return costo;
	}
	
	public void addProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public void deleteProducto(Producto producto) {
		this.productos.remove(producto);
	}
	
	public boolean existeProducto(Producto producto) {
		return this.productos.contains(producto);
	}
	
	public boolean isEmpty() {
		return this.productos.isEmpty();
	}
	/*public float costoFinal() {
		return this.prod1.costoFinal() + this.prod2.costoFinal() + this.prod3.costoFinal();
	}*/

}
