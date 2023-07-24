package ConversiónDeTemperatura;

import java.util.Scanner;

public class TemperatureService {
	Scanner leer= new Scanner(System.in);
	
	public Temperature CrearTemperature(){
		System.out.println("Porfavor ingrese la temperatura");
		double temperatura= leer.nextDouble();
		Temperature temperature= new Temperature(temperatura);
		return temperature;
	}
	
	public double CelsiusFahrenheit(double temp) {
		return (temp * (9/5)) + 32;
	}
	
	public double FahrenheitCelsius(double temp) {
		return ((temp-32)*5/9);
	}
	
	public double CelsiusKelvin(double temp) {
		return temp + 273.15;
	}
	
	public double KelvinCelsius(double temp) {
		return temp - 273.15;
	}
	
	public double FahrenheitKelvin(double temp) {
		return ((temp - 32) *5/9)+273.15;
	}
	
	public double KelvinFahrenheit(double temp) {
		return ((temp-273.15)*1.8)+32;
	}
	

}
