package fundamentos.aulas.collections;

import java.util.Arrays;

public class Exercicio1 {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		//System.out.println(notasAluno);
		System.out.println(Arrays.toString(notasAlunoA));

		//percorrer um array 1 exemplo
		
		for(int i = 0 ; i < notasAlunoA.length ; i++) {
			System.out.println(notasAlunoA[i]);
		}
		
		// percorrer um array usando o foreach forma mais simples de imprimir e percorrer um array
		
		for (double i : notasAlunoA) {
			System.out.println(i);
		}
		
			
		double[] notasAlunoB = {7 , 8.5 , 6.2 , 5.0}; //forma de declarar ja atribuindo valores literais
		for (int i = 0; i < notasAlunoB.length; i++) {
			;;
		}
		
	}

}
