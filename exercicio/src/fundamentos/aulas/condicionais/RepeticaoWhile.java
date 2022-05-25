package fundamentos.aulas.condicionais;

import java.util.Scanner;

/*
 * while(exprecao <- true // false){---bloco de código---}
 * sempre que a exprecao retorna true ela executa o bloco de codigo
 * podemos dizer que o while e usado para repeticoes *indeterminada*
 * <<<>>>><<<<<<<<><><><><><><><><><><><><><><><><><><><><><><><><><>
 * for(variavel ; exprecao<- retorna true//false ; incremento){bloco de codigo}
 */
public class RepeticaoWhile {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")){
			System.out.println("Digite o que desejar");
			valor = dado.nextLine();
		}
		dado.close();
	}
}
