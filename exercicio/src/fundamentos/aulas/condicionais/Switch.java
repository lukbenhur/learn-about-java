package fundamentos.aulas.condicionais;
/*
 * switch nao recebe expressoes que retornam valores booleanos, mas sim recebe valores inteiros (Int) ou strings
 * dentro do switch recebe cases value:{bloco de codigo} 
 * ex:.
			switch (key) {
			case value:
					bloco de codigo
				break;
				
			default: quando nao se entra em nenhum case entra por padrao no default
					o brake serve para sair do switch quando entrar em algum case;;
					caso nao tenha apos entrar em um dos cases os subsequentes seram executados simultaneamente
				break;
			}
 */
public class Switch {
	public static void main(String[] args) {
		//rotular um laço 
		
		externo: for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if(i == 2) {
					break externo;
				}
				System.out.print("i = " + i);
				System.out.print("j = " + j);
				System.out.println();
			}
		}
	}
}
//break interrompe o laço 
//continue interrompe a iteração e pula para a prox iteração do laço
