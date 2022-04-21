package fundamentos.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class B1_2_ExNotas {
	public static void main(String[] args) {
		double nota1,nota2,nota3,media,soma;
		Scanner nota = new Scanner(System.in);// basta instanciar uma unica vez!! depois e so ir armazendo as entradas em variaveis
		DecimalFormat casas;
		casas = new DecimalFormat("#.##");
		
		System.out.print("Digite a primeira nota: ");
		nota1 = nota.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = nota.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = nota.nextDouble();	
		soma = nota1 + nota2 + nota3;
		media = soma / 3;
		System.out.println("a media das notas do aluno é " + casas.format(media));
		
		nota.close();
		
	}
}
