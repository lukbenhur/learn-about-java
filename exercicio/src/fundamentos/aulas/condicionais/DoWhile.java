package fundamentos.aulas.condicionais;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		String valor;//nao preciso iniciar a variavel;
		do {
			System.out.println("Digite o que desejar");
			valor = dado.next();
		}while(!valor.equalsIgnoreCase("sair"));

		dado.close();

	}

}
