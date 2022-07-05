package fundamentos.aulas.introducao;

import java.util.Scanner;

/*
 * criar um app USANDO OPERADOR TERNARIO ternario para que um aluno com media maior que 7 imprima que passou por media, 
 * menor que 7 recupera�ao menor que 4 reprovado*/
public class A13_Operadores {
public static void main(String[] args) {
	double mediaAluno;
	String resultParcial,resultFinal;
	Scanner dado = new Scanner(System.in);
	
	System.out.print("Media do aluno:");
	mediaAluno = dado.nextDouble();
	//              --condi�ao=-----? se true----------- : se false--- 
	resultParcial = mediaAluno >= 4 ? "Em recupera��o." : "Reprovado.";
	resultFinal = mediaAluno >=7 ? "Aprovado." : resultParcial;
	
	System.out.println("O aluno esta: " + resultFinal);
	dado.close();	
}
}