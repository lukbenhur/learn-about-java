package fundamentos.aulas.condicionais;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * calcular as medias de uma turma de N alunos ,
 * usuario vai digitar nota valida de 0 - 10 
 * aramzenar o valor da nota em uma variavel total
 * e armazenar a soma das notas
 * contador de notas validas
 * mostrar a media
 * comando de sair = -1
 * 
 */
public class RevisaoWhile {
	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		double media, nota, SomaTotalNotas = 0;
		int numeroAlunos,quantidadeNotasValidas = 0;
		ArrayList<Double> notasDigitadas = new ArrayList<Double>();
		
		System.out.println("Quantos alunos sera digitado as notas?");
		numeroAlunos = dado.nextInt();
		do {
			System.out.println("Qual a nota do aluno?");
			nota = dado.nextDouble();
			if(nota != -1) {
				SomaTotalNotas += nota;
				notasDigitadas.add(nota);
				quantidadeNotasValidas++;
			}else {
				break;
			}
		}while(nota != -1 && quantidadeNotasValidas < numeroAlunos);

		media = SomaTotalNotas / quantidadeNotasValidas;
		System.out.printf("a soma das notas digitadas foi de : %.2f%n", SomaTotalNotas);
		System.out.printf("a quantidade de notas digitadas é de: %d%n", quantidadeNotasValidas );
		System.out.printf("a media das notas é de : %.2f%n", media);
		
		for (Double valor : notasDigitadas) {
			System.out.println("as notas que foram digitadas sao: " + valor);
		}
		
		dado.close();
		
		
		
}
}