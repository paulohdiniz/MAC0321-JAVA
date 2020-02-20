package meuPrimeiroPrograma;

public class Bandeirinha {
	int rg;
	
	public static void main(String args[]) {
		System.out.println ("Hello World!");
		System.out.println ("1º arg = " + args[0]);
		System.out.println ("2º arg = " + args[1]);
		System.out.println ("3º arg = " + args[2]);
		
		Bandeirinha bandeirinha1 = new Bandeirinha();
		bandeirinha1.rg = 11257630;
		bandeirinha1.venceuOTime("Palmeiras");
	}
	void venceuOTime(String nomeDoTime) {
		System.out.println ("Venceu o " + nomeDoTime + " time do "+ rg);
	}

}

