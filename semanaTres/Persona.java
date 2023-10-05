package semanaTres;

import java.time.LocalDate;


public class Persona {
	
	private String nombre;
	
	private String apellido;
	
	private LocalDate fechaNacimiento;
	
	private Carrito carrito;
	
	public Persona(String nombre, String apellido, LocalDate fechaNacimiento, Carrito carrito) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.carrito = carrito;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int edad() {
		LocalDate fechaActual = LocalDate.now();
		
		return(fechaActual.getYear() - this.fechaNacimiento.getYear());
		
	}
	

}
