package fundamentos.Exercicios;

public class Temperatura {
	
	public static void main(String[] args) {
		double cel, fah;
		final double AJUSTE, MULTIPLICADOR;
		fah = 150;
		AJUSTE = 32;
		MULTIPLICADOR = 5.0/9.0;
		cel = (fah - AJUSTE) * MULTIPLICADOR;
		System.out.println("o resultado de "+fah+"ºF "+ "em celsius é: " + cel);
	}
}
