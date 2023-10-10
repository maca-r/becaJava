package semanaTres;

public class DescuentoFijo extends Descuento{

	

	public DescuentoFijo(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float descontar(float precioInicial) {
		return precioInicial - this.getValor();
	}
	
	

}
