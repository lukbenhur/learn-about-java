package fundamentos.Exercicios;
//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
import java.util.Scanner;

public class Resultado {
	public static void main(String[] args) {
		double numero;
		
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Qual o valor que voc? quer?");
		numero = dado.nextDouble();
		final double quadrado = Math.pow(numero, 2);
		final double cubo = Math.pow(numero, 3);
		System.out.println("O quadrado e o cubo do numero digitado ?: " + quadrado + ", " +cubo+".");
		dado.close();
	}
}
