package CalculadoraDeDescuentos;

public class DiscountService {
	private static final double Discountmax=50;
	
	public double calcularDescuento(double preciobase,double preciodescuento) {
		return ((preciobase-preciodescuento)/preciobase)*100;
	}

	public static double getDiscountmax() {
		return Discountmax;
	}
	
	


}
