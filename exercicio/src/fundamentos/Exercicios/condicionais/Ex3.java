package fundamentos.Exercicios.condicionais;

import java.util.Scanner;

/*
 * 3. Criar um programa que receba duas notas parciais, calcular a média final.
	Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
 	se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação"
 * , caso contrário imprime no console "Reprovado".
 */
public class Ex3 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double nota,media,nota2;
		System.out.println("digite a primeira nota");
		nota = dado.nextDouble();
		System.out.println("digite a segunda nota");
		nota2 = dado.nextDouble();

		media = (nota + nota2) / 2;
		System.out.printf("a media é: %.2f%n",media);
		
		if(media >= 7) {
			System.out.println("aprovado");
		}else if(media >= 4) {
			System.out.println("recuperação");
		}else {
			System.out.println("reprovado");
		}
		dado.close();
	}
	
}