package fundamentos.Exercicios;

import java.util.Scanner;

//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
public class Triangulo {
	public static void main(String[] args) {
		double base,altura;
		Scanner dado = new Scanner(System.in);
		System.out.println("Qual o valor da base do triangulo?");
		base = dado.nextDouble();
		System.out.println("Qual o valor da altura do triangulo?");
		altura = dado.nextDouble();
		
		final double area = (base * altura) / 2;
		System.out.printf("a área do triangulo é de: %.2f.",area);
		dado.close();
	}
}
