package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioDoWhile {

	private static double undefined;

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double totalNotas = 0, somaNotas = 0, nota;
		int tentativas = 0,i=0;
		double[] notasAluno = new double[100];
		
		do {
			System.out.println("digite as notas");
			nota = dado.nextDouble();
			if((nota >= 0 && nota <= 10)) { //verifica se o intervalo é valido para fazer as somas;;
				totalNotas++;
				somaNotas = somaNotas + nota;
				notasAluno[i] = nota;
				i++;
			}else { //caso nao esteja no range válido executa o bloco else
				System.out.println("digite uma nota valida");
				tentativas++;	
				if(nota == -1 ||tentativas == 3) {
					System.out.printf("total de %d tentativas excedidas, ou usuario digitou -1%n%n",tentativas);
					break; //o codigo quebra caso o usauario digite -1 ou forneça 3 notas invalidas
				}
				nota = 0; //caso o usuario nao tenha digitado -1 sobrescrevo o valor da nota p entrar no loop novamente 
			}
				
		} while (nota >= 0 && nota <= 10); //verifica o loop
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
		
		for(int count = 0; count < notasAluno.length;count++) {
			if(notasAluno[count]== undefined) {
				
			}else {
				System.out.println("notas digitadas: " + notasAluno[count]);
			}
		}
		System.out.println("total de notas digitadas: "+totalNotas);
		System.out.println("soma das notas digitadas: "+somaNotas);
		System.out.println("media das notas digitadas: "+(somaNotas/totalNotas));
		dado.close();
	}
}
