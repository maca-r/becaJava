package semanaTres;

public class DescuentoFijo extends Descuento{

	

	public DescuentoFijo(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float descontar(float precioInicial) throws Exception {
		if(precioInicial == 0) {
			throw new Exception("No se puede aplicar descuento porque el costo es $0");
		}
		
		if ((precioInicial - this.getValor()) < 0) {
			throw new Exception("El valor con descuento no puede ser menor a $0");
		}
		return precioInicial - this.getValor();
	}
	
	

}
