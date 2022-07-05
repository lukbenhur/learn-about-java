package fundamentos.Exercicios.condicionais;

import java.util.Scanner;

/*
 * 8. Criar um programa que receba uma palavra e imprime no console letra por letra.
 */
public class Ex8 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		String palavra; //o tipo String e um tipo de array com char em cada indice;
		
		System.out.println("digite a palavra");
		palavra = dado.nextLine();
		
		for(int a = 0; a < palavra.length(); a++) {
			System.out.println(palavra.charAt(a));
		}
		dado.close();
	}
}
