package fundamentos.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Revisao {
	public static void main(String[] args) {
		
		double np1,np2,np3,np4,media,soma;
		String nome;
		Scanner dado = new Scanner(System.in);
		DecimalFormat nota = new DecimalFormat("#.##");
		
		
		System.out.println("Qual é o seu nome?");
		nome = dado.nextLine();
		System.out.println(nome + ", Quais foram as suas notas no semestre? Digite a primeira nota:");
		np1 = dado.nextDouble();
		System.out.println("Qual o valor da segunda nota?");
		np2 = dado.nextDouble();
		System.out.println("Qual o valor da terceira nota?");
		np3 = dado.nextDouble();
		System.out.println("Qual o valor da quarta nota?");
		np4 = dado.nextDouble();
		
		soma = np1+np2+np3+np4;
		media = soma / 4;
		System.out.println(nome + " A sua media atual é: " + nota.format(media));
		System.out.printf("%s A sua media atual é %.2f",nome,media);
	}
}
