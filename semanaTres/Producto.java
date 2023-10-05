package semanaTres;

public class Producto {
	
	private String nombre;
	private String codigo;
	private float precio;
	
	public Producto (String nombre, String codigo, float precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public void setCodigo(String nuevoCodigo) {
		this.codigo = nuevoCodigo;
	}
	
	public void setPrecio(float nuevoPrecio) {
		this.precio = nuevoPrecio;
	}
	
	public float costoFinal() {
		return this.precio;
	}
	
	
	

}
