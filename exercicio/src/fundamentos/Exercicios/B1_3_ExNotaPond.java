package fundamentos.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class B1_3_ExNotaPond {
	public static void main(String[] args) {
		double nota1,nota2,nota3,peso1,peso2,peso3,mediaPonderada;
		Scanner nota = new Scanner(System.in);//basta instanciar uma unica vez 
		Scanner peso = new Scanner(System.in); // basta instanciar uma unica vez e is aramazenando os valores na variavel de interesse
		DecimalFormat casas = new DecimalFormat("#.##");
		
		System.out.println("Digite o valor da primeira nota: ");
		nota1 = nota.nextDouble(); //armazenando o valor do "Scanner nota" na variavel nota1
		System.out.println("Digite o valor do peso da primeira nota: ");
		peso1 = peso.nextDouble(); //armazenando o valor do "Scanner peso" na variavel peso1
		System.out.println("Digite o valor da segunda nota: ");
		nota2 = nota.nextDouble();
		System.out.println("Digite o valor do peso da segunda nota: ");
		peso2 = peso.nextDouble();
		System.out.println("Digite o valor da terceira nota: ");
		nota3 = nota.nextDouble();
		System.out.println("Digite o valor do peso da terceira nota: ");
		peso3 = peso.nextDouble();
		nota.close();
		peso.close();
		mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		
		System.out.println("A média do aluno é de: " + casas.format(mediaPonderada));
		
		
	}
}
