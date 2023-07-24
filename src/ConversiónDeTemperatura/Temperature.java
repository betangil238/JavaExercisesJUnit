package ConversiónDeTemperatura;
//Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
//(por ejemplo, Celsius, Fahrenheit, Kelvin).
//Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
//se realiza correctamente y produce los resultados esperados.
public class Temperature {
	private double temp1;

	public Temperature(double temp1) {
		super();
		this.temp1 = temp1;

	}
	public Temperature() {
		super();
	}
	public double getTemp1() {
		return temp1;
	}
	public void setTemp1(double temp1) {
		this.temp1 = temp1;
	}

}
