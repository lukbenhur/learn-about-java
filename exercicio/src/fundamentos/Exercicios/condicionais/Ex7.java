package fundamentos.Exercicios.condicionais;

import java.util.Scanner;

/*
 * 7. Criar um programa que enquanto estiver recebendo números positivos,
 *  imprime no console a soma dos números inseridos, 
 *  caso receba um número negativo, encerre o programa. 
 *  Tente utilizar a estrutura do while.
 */
public class Ex7 {
	 public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int valor,contador = 0;
		do {
			System.out.println("Digite o número");
			valor = dado.nextInt();
			if(valor > 0) {
				contador += valor;
			}
		}while(valor >= 0);

		System.out.println(contador);

		dado.close();
		 
	}
}
