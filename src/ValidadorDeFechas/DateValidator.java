package ValidadorDeFechas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateValidator {
	
	DateService fs = new DateService();

	@Test
	void testValidarFecha() {
		int dia =10;
		int mes=1;
		int anio=2000;
		boolean expResult=true;
		boolean result= fs.validarFecha(dia, mes, anio);
		assertEquals(expResult,result);
	}
	
	@Test
	void testValidarFecha1() {
		int dia =29;
		int mes=2;
		int anio=2020;
		boolean expResult=true;
		boolean result= fs.validarFecha(dia, mes, anio);
		assertEquals(expResult,result);
	}
	@Test
	void testValidarFecha2() {
		int dia =29;
		int mes=2;
		int anio=2023;
		boolean expResult=false;
		boolean result= fs.validarFecha(dia, mes, anio);
		assertEquals(expResult,result);
	}
	
	@Test
	void testValidarFecha3() {
		int dia =31;
		int mes=10;
		int anio=1900;
		boolean expResult=true;
		boolean result= fs.validarFecha(dia, mes, anio);
		assertEquals(expResult,result);
	}
	
	@Test
	void testValidarFecha4() {
		int dia =31;
		int mes=16;
		int anio=1900;
		boolean expResult=false;
		boolean result= fs.validarFecha(dia, mes, anio);
		assertEquals(expResult,result);
	}

}
