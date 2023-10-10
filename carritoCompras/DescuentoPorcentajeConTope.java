package semanaTres;

public class DescuentoPorcentajeConTope extends Descuento{
	
	public DescuentoPorcentajeConTope(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}



	private float tope;
	


	public float getTope() {
		return tope;
	}



	public void setTope(float tope) {
		this.tope = tope;
	}



	@Override
	public float descontar(float precioInicial) {
		float precioFinal = precioInicial;
		
		
			if (this.getValor() < tope) {
				 precioFinal = precioInicial - (precioInicial * (1 - this.getValor()));
			}
			
		
		return precioFinal;
	}



	
	

}
