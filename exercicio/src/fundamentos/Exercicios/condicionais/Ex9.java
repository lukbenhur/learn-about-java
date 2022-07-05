package fundamentos.Exercicios.condicionais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */
public class Ex9 {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double numero;
		List<Double> numeros = new ArrayList<>();
		
		for (int i = 1; i <= 10 ; i++) {
			System.out.println("digite o numero");
			numero = dado.nextDouble();
			numeros.add(numero);
		}
		
		System.out.println("O maior numero incluido é: " + Collections.max(numeros));
		System.out.println("O menor numero incluido é: " + Collections.min(numeros));
		dado.close();

	}

}
