package semanaTres;

public abstract class Descuento {
	
	private float valor;
	
	public Descuento(float valor) {
		
		this.valor = valor;
	}	

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public abstract float descontar(float precioInicial) throws Exception;

	
	

}
