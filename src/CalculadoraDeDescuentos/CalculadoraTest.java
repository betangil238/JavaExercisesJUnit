package CalculadoraDeDescuentos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

//Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
//Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
//para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.)

public class CalculadoraTest {

	@Test
	public void VerificarDescuentos() {
		DiscountService calc= new DiscountService();
		assertEquals(10, calc.calcularDescuento(100, 90),0);
		assertEquals(10, calc.calcularDescuento(1000, 900),0);
		assertEquals(0, calc.calcularDescuento(100, 100),0);
		assertEquals(40, calc.calcularDescuento(100, 60),0);
		assertEquals(50, calc.calcularDescuento(100, 50),0);// el 0 indica que precision de exactitud requiere
	}
	
	@Test
	public void VerificarDescuentoMax() {
		DiscountService calc= new DiscountService();
		assertTrue(calc.calcularDescuento(100, 90)<=DiscountService.getDiscountmax());
		assertTrue(calc.calcularDescuento(100, 50)<=DiscountService.getDiscountmax());
		assertTrue(calc.calcularDescuento(100, 60)<=DiscountService.getDiscountmax());
	}
	
	@Test
	public void VerificarsinDescuentos() {
		DiscountService calc= new DiscountService();
		assertEquals(0, calc.calcularDescuento(100, 100),0);
	}
	
}
