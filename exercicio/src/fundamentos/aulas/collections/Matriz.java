package fundamentos.aulas.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double nota;
		int quantNotas, quantAlunos;
		
		System.out.println("Quantos alunos?");
		quantAlunos = dado.nextInt();
		System.out.println("quantas notas?");
		quantNotas = dado.nextInt();

		double[][] notasAlunos = new double[quantAlunos][quantNotas];
		//System.out.println(notasAlunos.length);
		//System.out.println(notasAlunos[1].length);
	
		
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.printf("digite a %d nota do %d aluno %n",(j+1),(i+1));
				nota = dado.nextDouble();
				notasAlunos[i][j] = nota;
			}
		}
		
		for (double[] ds : notasAlunos) { 
		//imprime o array dentro do array , indicando que em cada indice do array externo e um array mais interno
			System.out.println(Arrays.toString(ds)); 
		}
		dado.close();

	}

}
