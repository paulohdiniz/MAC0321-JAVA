package meuPrimeiroPrograma;

public class Conversor {

	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		conversor.fahrenheitParaCelsius(85);
		conversor.celsiusParaFahrenheit(100);
	}
	float celsiusParaFahrenheit (float tempCelsius) {
		float tempFahrenheit = (9*tempCelsius)/5 + 32;
		System.out.println("A temperatura é " + tempFahrenheit + "ºF");
		return tempFahrenheit; 
	}
	float fahrenheitParaCelsius (float tempFahrenheit) {
		float tempCelsius = (5*(tempFahrenheit -32))/9;
		System.out.println("A temperatura é " + tempCelsius + "ºC");
		return tempCelsius;
	}
}
