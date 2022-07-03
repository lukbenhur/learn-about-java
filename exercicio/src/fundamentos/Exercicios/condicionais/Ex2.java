package fundamentos.Exercicios.condicionais;

import java.util.Scanner;

/*
 * 2. Criar um programa informa se o ano atual é um ano bissexto;
 */
public class Ex2 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		System.out.println("Digite um ano");
		int ano = dado.nextInt();
		if(ano % 4 == 0) {
			if((ano % 100) != 0 ) {
				System.out.println("O ano é bissexto");
			}else if(ano % 400 == 0) {
				System.out.println("O ano é bissexto");
			}else {
				System.out.println("O ano nao é bissexto");
			}
		}else {
			System.out.println("O ano nao é bissexto");
		}
		dado.close();
	}
}
