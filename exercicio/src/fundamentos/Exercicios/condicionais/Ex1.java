package fundamentos.Exercicios.condicionais;

import java.util.Scanner;

/*
 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 * usando if's aninhados
 */
public class Ex1 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.println("entre com um número:");
		int numero = dado.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0 && numero != 0) {
				System.out.println("O número digitado é par");
			}else {
				if(numero == 0) {
					System.out.println("O número é neutro");
				}else {
					System.out.println("Você digitou um número ímpar");
				}
			}
		}else {
			System.out.println("digite um numero entre 0 -- 10");
		}
		
		dado.close();
	}
}
