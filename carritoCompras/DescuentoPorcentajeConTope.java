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
	public float descontar(float precioInicial) throws Exception{
		if(precioInicial == 0) {
			throw new Exception("No se puede aplicar descuento porque el costo es $0");
		}
		
		
		float precioFinal = precioInicial;
		
		
			if (this.getValor() < tope) {
				 precioFinal = precioInicial - (precioInicial * (1 - this.getValor()));
			}
			
		if (this.getValor() > 1) {
			throw new Exception("El valor con descuento no puede ser menor a $0");
		}
			
		return precioFinal;
	}



	
	

}
