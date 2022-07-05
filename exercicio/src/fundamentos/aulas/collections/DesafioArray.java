package fundamentos.aulas.collections;
//fazer o desafio segregando os 2 for's um 'tradicional' e o outro foreach
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int numeroNotas;
		double nota,somaNotas = 0,media;
		
		System.out.println("Quantas notas você quer incluir?");
		numeroNotas = dado.nextInt();
		
		double[] notas = new double[numeroNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("digite a %d nota:" , (i+1));
			nota = dado.nextDouble();
			notas[i] = nota;
		}
		
		//somaNotas = 0;
		for (double n : notas) {
			somaNotas += n;
		}
		
		System.out.printf("A soma das notas é de %.2f%n" , somaNotas);
		media = somaNotas / notas.length;
		System.out.printf("A media das notas é de %.2f" , media);
		dado.close();
	}
}
