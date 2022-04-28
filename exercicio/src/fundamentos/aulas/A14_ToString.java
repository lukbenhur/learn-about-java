package fundamentos.aulas;

import java.util.Scanner;

public class A14_ToString {

	public static void main(String[] args) {
		/*
		 * comparação de strings usa-se o .equals
		 */
		Scanner dado = new Scanner(System.in);
		String x = dado.nextLine(); //nextLine considera tudo que voce usa , next desconsidera o que vem apos os espaços
//		String x = dado.next(); nextLine considera tudo que voce usa , next desconsidera o que vem apos os espaços
		dado.close();
		System.out.println("2".equals(x.trim())); //se quiser comparar strings deve-se usar o .equals! .trim() desconsidera os espaços da string;
		//caso use o next o . tring nao é necessario.
	}

}
