package fundamentos.Exercicios.condicionais;

import java.util.Scanner;

/*
 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
 *  Armazene um numero aleatório em uma variável.
 *   O Jogador tem 10 tentativas para adivinhar o número gerado. 
 *   Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
 *  e imprima se o número inserido é maior ou menor do que o número armazenado.
 */
public class Ex6 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int aleatorio,tentativas = 1,tentativasRestantes,valor;
		aleatorio = (int) Math.round(Math.random()*100); //gerando o numero de 0--100;
		System.out.println(aleatorio);
		do {
			System.out.println("Qual o numero sorteado?");
			valor = dado.nextInt();
			tentativas++;
			if(tentativas > 10) {
				System.out.println("tentativas exedidas");
			}else if(valor != aleatorio) {
				tentativasRestantes = 11 - tentativas;
				System.out.println("faltam apenas "+ tentativasRestantes +" tentativas.");
				
				if(valor > aleatorio) {
					System.out.println("\no valor digitado por você é maior que o numero sorteado");
				}else {
					System.out.println("\no valor digitado por você é menor que o numero sorteado");
				}
				System.out.println();
			}
		}while(tentativas <= 10 && valor != aleatorio);
		
		if (valor == aleatorio) {
			System.out.println("Parabéns, Você acertou o número sorteado!!");
		}
		
		dado.close();
	}
}
