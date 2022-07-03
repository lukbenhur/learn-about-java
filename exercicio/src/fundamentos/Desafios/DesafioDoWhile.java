package fundamentos.Desafios;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DesafioDoWhile {
	private static double undefined;

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double totalNotas = 0, somaNotas = 0, nota;
		int tentativas = 0,i=0,contador;
		String convert,situacao;
		DecimalFormat formatar = new DecimalFormat("#.##");
		//double[] notasAluno = new double[100];
		ArrayList<Double> notasAluno = new ArrayList<Double>();
		
		
		System.out.println("Quantas notas serão digitadas?");
		contador = dado.nextInt();
		do {
			System.out.println("digite as notas");
			convert = dado.next().replace(",", ".");
			nota = Double.parseDouble(convert);
			if((nota >= 0 && nota <= 10)) { //verifica se o intervalo é valido para fazer as somas;;
				totalNotas++;
				somaNotas = somaNotas + nota;
				//notasAluno[i] = nota;
				notasAluno.add(nota);
				i++;
			}else { //caso nao esteja no range válido executa o bloco else
				System.out.println("digite uma nota valida");
				System.out.println("Se deseja sair digite (-1) ou (sair)");
				situacao = dado.next();
				tentativas++;	
				if(tentativas == 3 ||situacao.equalsIgnoreCase("sair")||situacao.equals("-1")) {
					System.out.printf("total de %d tentativas excedidas, ou usuario digitou -1 ou sair%n%n",tentativas);
					break; //o codigo quebra caso o usauario digite -1 ou forneça 3 notas invalidas
				}
				nota = 0; //caso o usuario nao tenha digitado -1 sobrescrevo o valor da nota p entrar no loop novamente 
			}
				
		} while (nota >= 0 && nota <= 10 && i+1 <= contador ); //verifica o loop
		
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
		
		for(int count = 0; count < notasAluno.size();count++) {
			//if(notasAluno[count]== undefined) {
			if(notasAluno.get(count)== undefined) {
				break;
			}else {
				//System.out.println("notas digitadas: " + notasAluno[count]);
				System.out.println("notas digitadas: " + notasAluno.get(count));
			}
		}
		System.out.println("total de notas digitadas: "+(int)totalNotas);
		System.out.println("soma das notas digitadas: "+somaNotas);
		System.out.println("media das notas digitadas: "+formatar.format(somaNotas/totalNotas));
		dado.close();
		System.out.println("As notas em ordem crescente ficam ");
		Collections.sort(notasAluno);
		System.out.println(notasAluno);
	}
}
 	