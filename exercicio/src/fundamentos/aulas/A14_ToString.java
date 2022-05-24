package fundamentos.aulas;

import java.util.Scanner;

public class A14_ToString {

	public static void main(String[] args) {
		/*
		 * compara��o de strings usa-se o .equals
		 */
		Scanner dado = new Scanner(System.in);
		String x = dado.nextLine(); //nextLine considera tudo que voce usa , next desconsidera o que vem apos os espa�os
//		String x = dado.next(); nextLine considera tudo que voce usa , next desconsidera o que vem apos os espa�os
		dado.close();
		System.out.println("2".equals(x.trim())); //se quiser comparar strings deve-se usar o .equals! .trim() desconsidera os espa�os da string;
		//caso use o next o . trim nao é necessario.
	}

}
