package ConversiónDeTemperatura;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TemperatureConverter {
	
//	@Before
//	public void setUp() {
//		 TemperatureService ts = new TemperatureService();
//	}

	@Test
	void testCelsiusFahrenheit() {
		TemperatureService ts= new TemperatureService();
		assertEquals(32, ts.CelsiusFahrenheit(0));
	}

	@Test
	void testFahrenheitCelsius() {
		TemperatureService ts= new TemperatureService();
		assertEquals(-17.7778, ts.FahrenheitCelsius(0),0.1);
	}

	@Test
	void testCelsiusKelvin() {
		TemperatureService ts= new TemperatureService();
		assertEquals(273.15, ts.CelsiusKelvin(0));
	}

	@Test
	void testKelvinCelsius() {
		TemperatureService ts= new TemperatureService();
		assertEquals(-273.15, ts.KelvinCelsius(0));
	}

	@Test
	void testFahrenheitKelvin() {
		TemperatureService ts= new TemperatureService();
		assertEquals(255.372, ts.FahrenheitKelvin(0),0.01);
	}

	@Test
	void testKelvinFahrenheit() {
		TemperatureService ts= new TemperatureService();
		assertEquals(-459.67, ts.KelvinFahrenheit(0),0.1);
	}

}
