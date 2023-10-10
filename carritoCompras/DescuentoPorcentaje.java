package semanaTres;

public class DescuentoPorcentaje extends Descuento{

	public DescuentoPorcentaje(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float descontar(float precioInicial) {
		
		return precioInicial - precioInicial * (1 - this.getValor());
	}
	
	

}
