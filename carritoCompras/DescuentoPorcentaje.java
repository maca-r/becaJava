package semanaTres;

public class DescuentoPorcentaje extends Descuento{

	public DescuentoPorcentaje(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float descontar(float precioInicial) throws Exception {
		if(precioInicial == 0) {
			throw new Exception("No se puede aplicar descuento porque el costo es $0");
		}
		
		if (this.getValor() > 1) {
			throw new Exception("El valor con descuento no puede ser menor a $0");
		}
		
		return precioInicial - precioInicial * (1 - this.getValor());
	}
	
	

}
