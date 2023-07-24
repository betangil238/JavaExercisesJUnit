package CalculadoraDeDescuentos;

public class Discount {
	double precioBase;
	double precioDescuento;
	double porcentajeDescuentoMax=0.5;
	public Discount() {
		super();
	}
	public Discount(double precioBase, double precioDescuento) {
		super();
		this.precioBase = precioBase;
		this.precioDescuento = precioDescuento;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public double getPorcentajeDescuentoMax() {
		return porcentajeDescuentoMax;
	}
	public void setPorcentajeDescuentoMax(double porcentajeDescuentoMax) {
		this.porcentajeDescuentoMax = porcentajeDescuentoMax;
	}
	public double getPrecioDescuento() {
		return precioDescuento;
	}
	
	

}
